package com.chart.model;

public class CpuRateData {
	private String ip;
	private long usedBytes;
	private long totalBytes;
	private long time;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
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
	public double getCpuRate(){
		return ((double)this.usedBytes)/this.totalBytes;
	}
}
