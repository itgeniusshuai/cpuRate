package com.chart.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chart.model.ServerInfo;
import com.chart.service.ServerService;

@RequestMapping("/server")
@Controller
public class ServerController {
	@Autowired
	private ServerService serverService;
	@RequestMapping("/showall")
	public String showAllServers(HttpServletRequest request){
		List<ServerInfo> serverInfos = serverService.queryAllServerInfos(null);
		request.setAttribute("serverInfos", serverInfos);
		return "servers/serverList";
	}
	@RequestMapping("/add")
	public String addServer(ServerInfo serverInfo){
		System.out.println(serverInfo);
		return "chain:showall";
	}
}
