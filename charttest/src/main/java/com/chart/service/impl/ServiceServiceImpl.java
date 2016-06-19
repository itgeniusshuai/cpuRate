package com.chart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chart.dao.ServerDao;
import com.chart.model.ServerInfo;
import com.chart.service.ServerService;
@Service
public class ServiceServiceImpl implements ServerService{
	@Autowired
	private ServerDao serverDao;
	@Override
	public List<ServerInfo> queryAllServerInfos(ServerInfo serverInfo) {
		List<ServerInfo> list=serverDao.queryServerInfos(null);
		return list;
	}

}
