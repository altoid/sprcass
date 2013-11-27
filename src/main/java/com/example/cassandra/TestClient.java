package com.example.cassandra;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import com.datastax.driver.core.Cluster;
//import com.datastax.driver.core.Host;
//import com.datastax.driver.core.Metadata;
//import com.datastax.driver.core.Session;
//import com.datastax.driver.core.ResultSet;
//import com.datastax.driver.core.Row;
//import com.datastax.driver.core.PreparedStatement;
//import com.datastax.driver.core.BoundStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class TestClient 
{
    private Log m_log = LogFactory.getLog(TestClient.class);

    public void constructorTestDS()
    {
	//	DataSource ds = new BasicCassDataSource("as01.pfen1.tivo.com");
	DataSource ds = new BasicCassDataSource("10.100.182.166");
	m_log.debug("< constructorTestDS");
    }

    public void constructorTestConn()
    {
	try {
	    m_log.debug("> constructorTestConn");
	
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    Connection conn = ds.getConnection();
	    conn.close();

	    m_log.debug("< constructorTestConn");
	}
	catch (SQLException e) {
	}
    }

    public void queryTest()
    {
	Statement stmt = null;
	Connection conn = null;
	try {
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    conn = ds.getConnection();
	    stmt = conn.createStatement();

	    java.sql.ResultSet rs = stmt.executeQuery("select * from testks.testcf;"); // need to append ";"

	    while (rs.next()) {
		System.out.println(String.format("%-20s\t%-20s\t%-30s",
						 rs.getString("keeey"),
						 rs.getString("column1"),
						 rs.getString("value")));
	    }
	}
	catch (SQLException e) {
	    m_log.fatal("got sqlexception", e);
	}
	finally {
	    try {
		stmt.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		conn.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing conn", e);
	    }
	}
    }

    // test getting columns by number instead of by name
    public void queryTestColumnIdx()
    {
	Statement stmt = null;
	Connection conn = null;
	try {
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    conn = ds.getConnection();
	    stmt = conn.createStatement();

	    java.sql.ResultSet rs = stmt.executeQuery("select * from testks.testcf;"); // need to append ";"

	    while (rs.next()) {
		System.out.println(String.format("%-20s\t%-20s\t%-30s",
						 rs.getString(1),
						 rs.getString(2),
						 rs.getString(3)));
	    }
	}
	catch (SQLException e) {
	    m_log.fatal("got sqlexception", e);
	}
	finally {
	    try {
		stmt.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		conn.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing conn", e);
	    }
	}
    }

    public void itrTest()
    {
	Statement stmt = null;
	Connection conn = null;
	try {
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    conn = ds.getConnection();
	    stmt = conn.createStatement();

	    java.sql.ResultSet rs = stmt.executeQuery("select * from testks.testcf;"); // need to append ";"

	    int counter = 0;
	    m_log.debug("before loop:  isBeforeFirst = " + rs.isBeforeFirst() + ", isAfterLast = " + rs.isAfterLast() + ", counter = " +  counter);
	    while (rs.next()) {
		counter ++;
		m_log.debug("in loop:  isBeforeFirst = " + rs.isBeforeFirst() + ", isAfterLast = " + rs.isAfterLast() + ", counter = " +  counter);
	    }
	    m_log.debug("after loop:  isBeforeFirst = " + rs.isBeforeFirst() + ", isAfterLast = " + rs.isAfterLast() + ", counter = " +  counter);
	}
	catch (SQLException e) {
	    m_log.fatal("got sqlexception", e);
	}
	finally {
	    try {
		stmt.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		conn.close();
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing conn", e);
	    }
	}
    }

    public static void main(String[] args) 
    {
	TestClient client = new TestClient();
//	client.constructorTestDS();
//	client.constructorTestConn();
//	client.itrTest();
//	client.queryTest();
	client.queryTestColumnIdx();
    }
}