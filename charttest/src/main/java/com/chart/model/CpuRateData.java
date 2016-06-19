package com.chart.model;

public class CpuRateData {
	private Integer ip;
	private long usedBytes;
	private long totalBytes;
	private long time;
	public Integer getIp() {
		return ip;
	}
	public void setIp(Integer ip) {
		this.ip = ip;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getUsedBytes() {
		return usedBytes;
	}
	public void setUsedBytes(long usedBytes) {
		this.usedBytes = usedBytes;
	}
	public long getTotalBytes() {
		return totalBytes;
	}
	public void setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
	}
}
