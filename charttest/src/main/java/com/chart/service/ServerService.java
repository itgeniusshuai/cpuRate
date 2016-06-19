package com.chart.service;

import java.util.List;

import com.chart.model.ServerInfo;

public interface ServerService {
	List<ServerInfo> queryAllServerInfos(ServerInfo serverInfo);
}
