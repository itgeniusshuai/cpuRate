package com.chart.model;

import java.util.concurrent.ConcurrentHashMap;

import ch.ethz.ssh2.Connection;

public class GlobalData {
	public static ConcurrentHashMap<String, Connection> connections;

}
