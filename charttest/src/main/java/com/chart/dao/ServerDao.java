package com.chart.dao;

import java.util.List;

import com.chart.model.ServerInfo;

public interface ServerDao {
	public List<ServerInfo> queryServerInfos(ServerInfo serverInfo);
}
