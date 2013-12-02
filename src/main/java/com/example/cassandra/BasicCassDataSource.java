package com.example.cassandra;

import java.io.PrintWriter;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class BasicCassDataSource
    implements javax.sql.DataSource
{
    private Log m_log = LogFactory.getLog(SimpleClient.class);

    private String m_node;

    public BasicCassDataSource(String node)
    {
	m_log.debug("> BasicCassDataSource ctor");
	m_node = node;
	m_log.debug("< BasicCassDataSource ctor");
    }

    /////////////////////////////////////////////////// DataSource implementation
    public
    Connection
	getConnection()
	throws SQLException
    {
	Connection conn = new BasicCassConnection(m_node);

	return conn;
    }

    public
    Connection
	getConnection(String username, String password)
    {
	return null;
    }

    /////////////////////////////////////////////////// CommonDataSource implementation
    public
    int getLoginTimeout()
	throws SQLException
    {
	return 0;
    }

    public
    void setLoginTimeout(int seconds)
	throws SQLException
    {
    }

    public 
	PrintWriter
	getLogWriter()
	throws SQLException
    {
	return null;
    }

    public 
	void
	setLogWriter(PrintWriter out)
	throws SQLException
    {
    }

    /////////////////////////////////////////////////// Wrapper implementation
    public
	boolean isWrapperFor(Class<?> iface)
	throws SQLException
    {
	return false;
    }

    public
	<T> T unwrap(Class<T> iface)
	throws SQLException
    {
	return null;
    }
}
