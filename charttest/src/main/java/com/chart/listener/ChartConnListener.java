package com.chart.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.factory.annotation.Autowired;

import ch.ethz.ssh2.Connection;

import com.chart.model.GlobalData;
import com.chart.service.ServerService;

public class ChartConnListener implements ServletContextListener{

	@Autowired
	private ServerService serverService;
	public void contextInitialized(ServletContextEvent sce) {
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		if(GlobalData.connections==null||GlobalData.connections.size()==0) return;
		for(Connection connection:GlobalData.connections.values()){
			connection.close();
		}
	}

}
