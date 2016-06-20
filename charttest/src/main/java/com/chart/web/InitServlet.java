package com.chart.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ch.ethz.ssh2.Connection;

import com.chart.model.GlobalData;
import com.chart.model.ServerInfo;
import com.chart.service.ServerService;
@Controller
public class InitServlet extends HttpServlet{
	@Autowired
	private ServerService serverService;
//	@Override
//	protected void init(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		//查询所有的服务，并建立ssh连接
//				List<ServerInfo> serverInfos=serverService.queryAllServerInfos(null);
//				//建立连接
//				for(ServerInfo serverInfo:serverInfos){
//					Connection connection=new Connection(serverInfo.getIp(),serverInfo.getPort());
//					try {
//						boolean b = connection.authenticateWithPassword(serverInfo.getUsername(), serverInfo.getPwd());
//						if(b){
//							GlobalData.connections.put(serverInfo.getIp(), connection);
//						}
//					} catch (IOException e) {
//						e.printStackTrace();
//						continue;
//					}
//				}
//	}
//	public InitServlet() {
//		//查询所有的服务，并建立ssh连接
//		List<ServerInfo> serverInfos=serverService.queryAllServerInfos(null);
//		//建立连接
//		for(ServerInfo serverInfo:serverInfos){
//			Connection connection=new Connection(serverInfo.getIp(),serverInfo.getPort());
//			try {
//				boolean b = connection.authenticateWithPassword(serverInfo.getUsername(), serverInfo.getPwd());
//				if(b){
//					GlobalData.connections.put(serverInfo.getIp(), connection);
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//				continue;
//			}
//		}
//	}
}
