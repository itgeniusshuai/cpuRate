package com.chart.service;

import com.chart.model.CpuRate;

public interface ChartService {
	CpuRate getCpuRate(String ip);
}
