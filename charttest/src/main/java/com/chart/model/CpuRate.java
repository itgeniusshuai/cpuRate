package com.chart.model;

import java.util.List;

public class CpuRate {
	private List<String> times;
	public List<String> getTimes() {
		return times;
	}
	public void setTimes(List<String> times) {
		this.times = times;
	}
	public List<Double> getDatas() {
		return datas;
	}
	public void setDatas(List<Double> datas) {
		this.datas = datas;
	}
	private List<Double> datas;
	
	
}
