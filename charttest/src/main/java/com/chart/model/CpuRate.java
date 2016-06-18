package com.chart.model;

import java.util.Date;
import java.util.List;

public class CpuRate {
	private List<Date> times;
	public List<Date> getTimes() {
		return times;
	}
	public void setTimes(List<Date> times) {
		this.times = times;
	}
	public List<List<Double>> getDatas() {
		return datas;
	}
	public void setDatas(List<List<Double>> datas) {
		this.datas = datas;
	}
	private List<List<Double>> datas;
	
	
}
