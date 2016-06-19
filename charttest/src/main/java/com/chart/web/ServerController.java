package com.chart.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
