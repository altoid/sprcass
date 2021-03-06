package com.example.cassandra;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Struct;

public class BasicCassStatement
    implements Statement
{
    private boolean m_isClosed;
    private BasicCassConnection m_conn;

    public BasicCassStatement(BasicCassConnection conn)
    {
	m_conn = conn;
	m_isClosed = false;
    }

    /////////////////////////////////////////////////// Statement implementation
    public
	void addBatch(String sql) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void cancel() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void clearBatch() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void clearWarnings() 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("statement is closed");
	}

	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void close() 
	throws SQLException
    {
	m_isClosed = true;
    }

    public
	boolean execute(String sql) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	
	// return false;
    }

    public
	boolean execute(String sql, int autoGeneratedKeys) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	boolean execute(String sql, int[] columnIndexes) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	boolean execute(String sql, String[] columnNames) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	int[] executeBatch() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return null;
    }

    public
	ResultSet executeQuery(String sql) 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("statement is closed");
	}

	com.datastax.driver.core.Session cassSession = m_conn.getCassSession();
	com.datastax.driver.core.ResultSet rs = 
	    cassSession.execute(sql);

	BasicCassResultSet brs = new BasicCassResultSet(rs);

	return brs;
    }

    public
	int executeUpdate(String sql) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int executeUpdate(String sql, int autoGeneratedKeys) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int executeUpdate(String sql, int[] columnIndexes) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int executeUpdate(String sql, String[] columnNames) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	Connection getConnection() 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("statement is closed");
	}

	return m_conn;
    }

    public
	int getFetchDirection() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int getFetchSize() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	ResultSet getGeneratedKeys() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return null;
    }

    public
	int getMaxFieldSize() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int getMaxRows() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	boolean getMoreResults() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	boolean getMoreResults(int current) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	int getQueryTimeout() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	ResultSet getResultSet() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return null;
    }

    public
	int getResultSetConcurrency() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int getResultSetHoldability() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int getResultSetType() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	int getUpdateCount() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	SQLWarning getWarnings() 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("statement is closed");
	}

	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	boolean isClosed() 
	throws SQLException
    {
	return m_isClosed;
    }

    public
	boolean isPoolable() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

	// return false;
    }

    public
	void setCursorName(String name) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setEscapeProcessing(boolean enable) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setFetchDirection(int direction) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setFetchSize(int rows) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setMaxFieldSize(int max) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setMaxRows(int max) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setPoolable(boolean poolable) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    public
	void setQueryTimeout(int seconds) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }

    /////////////////////////////////////////////////// Wrapper implementation
    public
	boolean isWrapperFor(Class<?> iface)
	throws SQLException
    {
	return iface.isAssignableFrom(getClass());
    }

    public
	<T> T unwrap(Class<T> iface)
	throws SQLException
    {
	if (isWrapperFor(iface)) {
	    
	    return (T) this;
	}

	throw new SQLFeatureNotSupportedException("not a wrapper for " + iface.getName());
    }
}