package com.example.cassandra;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

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

	    ResultSet rs = stmt.executeQuery("select * from testks.testcf;"); // need to append ";"

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
		if (stmt != null) {
		    stmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (conn != null) {
		    conn.close();
		}
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
		if (stmt != null) {
		    stmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (conn != null) {
		    conn.close();
		}
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
		if (stmt != null) {
		    stmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (conn != null) {
		    conn.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing conn", e);
	    }
	}
    }

    public void testPreparedQuery()
    {
	// select * from testks.testcf where keeey = 'heee';
	// should get 2 rows

	PreparedStatement stmt = null;
	Connection conn = null;
	String sql = "select * from testks.testcf where keeey = ?;";

	try {
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    conn = ds.getConnection();
	    stmt = conn.prepareStatement(sql);

	    stmt.setString(1, "heee");

	    ResultSet rs = stmt.executeQuery();

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
		if (stmt != null) {
		    stmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (conn != null) {
		    conn.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing conn", e);
	    }
	}
    }

    public void testCRUD()
    {
	/*
CREATE TABLE hodgepodge (
  "timestamp" timestamp,
  boolean boolean,
  float float,
  int int,
  varchar text,
  PRIMARY KEY ("timestamp")
) WITH
	*/

	Connection conn = null;
	PreparedStatement insertStmt = null;
	PreparedStatement updateStmt = null;
	PreparedStatement queryStmt = null;
	ResultSet rs = null;

	String insertSql = "insert into testks.hodgepodge (boolean, float, int, varchar, timestamp) VALUES (?,?,?,?,?);";
	String updateSql = "update testks.hodgepodge set varchar = ? where timestamp = ?;";
	String querySql = "select * from testks.hodgepodge where timestamp = ?;";

	try {
	    DataSource ds = new BasicCassDataSource("10.100.182.166");

	    conn = ds.getConnection();
	    Timestamp ts = new Timestamp(System.currentTimeMillis());

	    insertStmt = conn.prepareStatement(insertSql);
	    insertStmt.setString   (4, "humphrey");
	    insertStmt.setFloat    (2, (float)3.1416);
	    insertStmt.setBoolean  (1, true);
	    insertStmt.setInt      (3, 48);
	    insertStmt.setTimestamp(5, ts);

	    int status = insertStmt.executeUpdate();

	    updateStmt = conn.prepareStatement(updateSql);
	    updateStmt.setTimestamp(2, ts);
	    updateStmt.setString(1, "homer");

	    status = updateStmt.executeUpdate();

	    queryStmt = conn.prepareStatement(querySql);
	    queryStmt.setTimestamp(1, ts);
	    rs = queryStmt.executeQuery();

	    while (rs.next()) {
		String formatString = "%-20s\t%-20s\t%-20s\t%-20f\t%-20d";
		System.out.println(String.format(formatString,
						 rs.getTimestamp("timestamp"),
						 rs.getString("varchar"),
						 rs.getBoolean("boolean") ? "True" : "False",
						 rs.getFloat("float"),
						 rs.getInt("int")));
		System.out.println(String.format(formatString,
						 rs.getTimestamp(1),
						 rs.getString(5),
						 rs.getBoolean(2) ? "True" : "False",
						 rs.getFloat(3),
						 rs.getInt(4)));
	    }

	}
	catch (SQLException e) {
	    m_log.fatal("got sqlexception", e);
	}
	finally {
	    try {
		if (rs != null) {
		    rs.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing result set", e);
	    }

	    try {
		if (queryStmt != null) {
		    queryStmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (insertStmt != null) {
		    insertStmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (updateStmt != null) {
		    updateStmt.close();
		}
	    }
	    catch (Exception e) {
		m_log.fatal("got exception when closing stmt", e);
	    }

	    try {
		if (conn != null) {
		    conn.close();
		}
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
//	client.queryTestColumnIdx();
//	client.testPreparedQuery();
	client.testCRUD();
    }
}