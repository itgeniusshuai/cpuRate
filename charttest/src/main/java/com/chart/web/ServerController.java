package com.chart.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;

import com.chart.model.CpuRate;
import com.chart.model.CpuRateData;
import com.chart.model.GlobalData;
import com.chart.model.ServerInfo;
import com.chart.service.ServerService;

@Controller
@RequestMapping("/server")
public class ServerController {
	@Autowired
	private ServerService serverService;
	
	@RequestMapping("/showall")
	public String showAllServers(HttpServletRequest request,HttpServletResponse response){
		List<ServerInfo> serverInfos = serverService.queryAllServerInfos(null);
		System.out.println(response);
		request.setAttribute("serverInfos", serverInfos);
		return "servers/serverList";
	}
	@RequestMapping("/add")
	public String addServer(ServerInfo serverInfo){
		System.out.println(serverInfo);
		return "chain:showall";
	}
	@RequestMapping("/queryRate")
	@ResponseBody
	public CpuRate queryRate(String ip,HttpServletRequest request){
		//获取connection
		Connection connection = GlobalData.connections.get(ip);
		if(connection==null){
			ServerInfo serverInfo = new ServerInfo();
			serverInfo.setIp(ip);
			List<ServerInfo> infos = serverService.queryAllServerInfos(serverInfo);
			serverInfo = infos.get(0);
			connection=new Connection(serverInfo.getIp(),serverInfo.getPort());
			try {
				connection.connect();
				boolean b = connection.authenticateWithPassword(serverInfo.getUsername(), serverInfo.getPwd());
				if(b){
					GlobalData.connections.put(serverInfo.getIp(), connection);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		CpuRateData cpuRateData=getCpuData(connection);
		LinkedHashMap<String ,Double> map = GlobalData.cpuRateData.get(ip);
		if(map==null) map=new LinkedHashMap<String, Double>();
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:SS");
		map.put(format.format(new Date()), cpuRateData.getCpuRate());
		while(map.size()>5){
			map.remove(0);
		}
		CpuRate cpuRate=new CpuRate();
		cpuRate.setTimes(new ArrayList(map.keySet()));
		cpuRate.setDatas(new ArrayList(map.values()));
		return cpuRate;
	}
	@RequestMapping("/toCpuRate")
	public String toCpuRate(String ip,HttpServletRequest request){
		request.setAttribute("ip", ip);
		return "showCpuRate";
	}
	
	private CpuRateData getCpuData(Connection connection){
		CpuRateData cpuRateData=new CpuRateData();
		try {
			Session session = connection.openSession();
			session.execCommand("free -m");
			InputStream inputStream = session.getStdout();
			BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
			reader.readLine();
			String data=reader.readLine();
			String[] datas=data.split("\\s+");
			cpuRateData.setTotalBytes(Long.parseLong(datas[1]));
			cpuRateData.setUsedBytes(Long.parseLong(datas[2]));
			cpuRateData.setTime(new Date().getTime());
			cpuRateData.setIp(connection.getHostname());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cpuRateData;
	}
}