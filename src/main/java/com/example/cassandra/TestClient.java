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
	}
	finally {
	    try {
		stmt.close();
	    }
	    catch (Exception e) {
	    }

	    try {
		conn.close();
	    }
	    catch (Exception e) {
	    }
	}
    }

    public static void main(String[] args) 
    {
	TestClient client = new TestClient();
	client.constructorTestDS();
	client.constructorTestConn();
	//	client.queryTest();
    }
}