package com.chart.model;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

import ch.ethz.ssh2.Connection;

public class GlobalData {
	public static ConcurrentHashMap<String, Connection> connections=new ConcurrentHashMap<String, Connection>();
	public static ConcurrentHashMap<String, LinkedHashMap<String, Double>> cpuRateData=new ConcurrentHashMap<String, LinkedHashMap<String,Double>>();//time->value
	
}
