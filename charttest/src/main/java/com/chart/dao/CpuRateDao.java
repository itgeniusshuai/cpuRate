package com.chart.dao;

import java.util.List;

import com.chart.model.CpuRateData;

public interface CpuRateDao {
	//查询某个ip在某段时间内的值
	public List<CpuRateData> getCpuData(String ip,long starttime,long endTime);
}
