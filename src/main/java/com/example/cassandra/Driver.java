package com.example.cassandra;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;

import java.util.Enumeration;
import java.util.Properties;

public class Driver
    implements java.sql.Driver
{
    private Log m_log = LogFactory.getLog(Driver.class);

    static {
	Log _log =  LogFactory.getLog(Driver.class);
	_log.debug("> static block in Driver");
	Driver instance = new Driver();

	try {
	    DriverManager.registerDriver(instance);
	    _log.debug("< static block in Driver");
	}
	catch (SQLException e) {
	}
    }

    public
	Driver() {
	m_log.debug("> Driver ctor");
    }

    private Properties
	parseURL(String url)
    {
	Properties returnMe = new Properties();

	String[] parts = url.split(":");

	if (parts.length < 3) {
	    return null;
	}

	returnMe.setProperty("protocol", parts[0]);
	returnMe.setProperty("database", parts[1]);

	url = parts[2].substring(2); // lop off the initial '//' chars

	parts = url.split("/");

	if (parts.length < 2) {
	    return null;
	}

	returnMe.setProperty("node", parts[0]);
	returnMe.setProperty("keyspace", parts[1]);

	return returnMe;
    }

    public
	boolean acceptsURL(String url) 
	throws SQLException
    {
	m_log.debug("acceptsURL:  |" + url + "|");

	Properties parts = parseURL(url);

	return parts != null;
    }

    public
	Connection connect(String url, Properties info) 
	throws SQLException
    {
	m_log.debug("connect:  |" + url + "|");

	Properties parts = parseURL(url);
	if (parts == null) {
	    return null;
	}

	String node = parts.getProperty("node");

	Connection conn = new BasicCassConnection(node);

	return conn;
    }

    public
	int getMajorVersion() 
    {
	m_log.debug("getMajorVersion");
	return 0;
    }

    public
	int getMinorVersion() 
    {
	m_log.debug("getMinorVersion");
	return 1;
    }

    public
	DriverPropertyInfo[] getPropertyInfo(String url, Properties info) 
	throws SQLException
    {
	m_log.debug("getPropertyInfo");
	return null;
    }

    public
	boolean jdbcCompliant() 
    {
	m_log.debug("jdbcCompliant");
	return false;
    }
}
