package com.example.cassandra;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Struct;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class BasicCassConnection
    implements Connection
{
    private Cluster m_cluster;
    private Session m_session;
    private boolean m_isClosed;
    private Map<String, Class<?>> m_typeMap;

    BasicCassConnection(String node)
    {
	m_cluster = Cluster
	    .builder()
            .addContactPoint(node)
	    .build();

	m_session = m_cluster.connect();
	m_isClosed = false;
	m_typeMap = new HashMap<String, Class<?>>();
    }

    Session getCassSession()
    {
	return m_session;
    }

    /////////////////////////////////////////////////// Connection implementation
    public
	void clearWarnings() 
	throws SQLException
    {
    }

    public
	void close() 
	throws SQLException
    {
	m_cluster.shutdown();
	m_isClosed = true;
    }

    public
	void commit() 
	throws SQLException
    {
    }

    public
	Array createArrayOf(String typeName, Object[] elements) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Blob createBlob() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Clob createClob() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	NClob createNClob() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	SQLXML createSQLXML() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Statement createStatement() 
	throws SQLException
    {
	BasicCassStatement stmt = new BasicCassStatement(this);
	return stmt;
    }

    public
	Statement createStatement(int resultSetType, int resultSetConcurrency) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Struct createStruct(String typeName, Object[] attributes) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	boolean getAutoCommit() 
	throws SQLException
    {
	return false;
    }

    public
	String getCatalog() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	Properties getClientInfo() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	String getClientInfo(String name) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	int getHoldability() 
	throws SQLException
    {
	return 0;
    }

    public
	DatabaseMetaData getMetaData() 
	throws SQLException
    {
	if (m_isClosed) {
	    throw new SQLException("connection is closed");
	}

	return new CassMetaData();
    }

    public
	int getTransactionIsolation() 
	throws SQLException
    {
	return 0;
    }

    public
	Map<String, Class<?>> getTypeMap() 
	throws SQLException
    {
	if (m_isClosed) {
	    throw new SQLException("connection is closed");
	}

	return m_typeMap;
    }

    public
	SQLWarning getWarnings() 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	boolean isClosed() 
	throws SQLException
    {
	return m_isClosed;
    }

    public
	boolean isReadOnly() 
	throws SQLException
    {
	return false;
    }

    public
	boolean isValid(int timeout) 
	throws SQLException
    {
	return false;
    }

    public
	String nativeSQL(String sql) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	CallableStatement prepareCall(String sql) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	PreparedStatement prepareStatement(String sql) 
	throws SQLException
    {		      
	PreparedStatement ps = new BasicCassPreparedStatement(this, sql);
	return ps;
    }		      
		      
    public
	PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) 
	throws SQLException
    {		      
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }		      
		      
    public
	PreparedStatement prepareStatement(String sql, int[] columnIndexes) 
	throws SQLException
    {		      
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }		      
		      
    public
	PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) 
	throws SQLException
    {		      
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }		      
		      
    public
	PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) 
	throws SQLException
    {		      
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }		      
		      
    public
	PreparedStatement prepareStatement(String sql, String[] columnNames) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void releaseSavepoint(Savepoint savepoint) 
	throws SQLException
    {
    }

    public
	void rollback() 
	throws SQLException
    {
    }

    public
	void rollback(Savepoint savepoint) 
	throws SQLException
    {
    }

    public
	void setAutoCommit(boolean autoCommit) 
	throws SQLException
    {
    }

    public
	void setCatalog(String catalog) 
	throws SQLException
    {
    }

    public
	void setClientInfo(Properties properties) 
	throws SQLClientInfoException
    {
    }

    public
	void setClientInfo(String name, String value) 
	throws SQLClientInfoException
    {
    }

    public
	void setHoldability(int holdability) 
	throws SQLException
    {
    }

    public
	void setReadOnly(boolean readOnly) 
	throws SQLException
    {
    }

    public
	Savepoint setSavepoint() 
	throws SQLException
    {	      
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();

    }	      
	      
    public
	Savepoint setSavepoint(String name) 
	throws SQLException
    {
	// =================================== UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setTransactionIsolation(int level) 
	throws SQLException
    {
    }

    public
	void setTypeMap(Map<String,Class<?>> map) 
	throws SQLException
    {
	if (m_isClosed) {
	    throw new SQLException("connection is closed");
	}

	m_typeMap = map;
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
