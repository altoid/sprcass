package com.example.cassandra;

import java.io.InputStream;
import java.io.Reader;

import java.math.BigDecimal;

import java.net.URL;

import java.util.Calendar;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Time;
import java.sql.Timestamp;

public class BasicCassPreparedStatement
    extends BasicCassStatement
    implements PreparedStatement
{
    private com.datastax.driver.core.BoundStatement m_bs;
    private com.datastax.driver.core.Session m_session;

    public BasicCassPreparedStatement(BasicCassConnection conn,
				      String sql)
    {
	super(conn);
	m_session = conn.getCassSession();
	com.datastax.driver.core.PreparedStatement ps = m_session.prepare(sql);
	m_bs = new com.datastax.driver.core.BoundStatement(ps);
    }

    /////////////////////////////////////////////////// PreparedStatement implementation
    public
	void addBatch() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void clearParameters() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	boolean execute() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return false;
    }

    public
	ResultSet executeQuery() 
	throws SQLException
    {
	com.datastax.driver.core.ResultSet cass_rs = 
	    m_session.execute(m_bs);

	ResultSet rs = new BasicCassResultSet(cass_rs);
	return rs;
    }

    public
	int executeUpdate() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return 0;
    }

    public
	ResultSetMetaData getMetaData() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return null;
    }

    public
	ParameterMetaData getParameterMetaData() 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
	// return null;
    }

    public
	void setArray(int parameterIndex, Array x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setAsciiStream(int parameterIndex, InputStream x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setAsciiStream(int parameterIndex, InputStream x, int length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setAsciiStream(int parameterIndex, InputStream x, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBigDecimal(int parameterIndex, BigDecimal x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBinaryStream(int parameterIndex, InputStream x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBinaryStream(int parameterIndex, InputStream x, int length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBinaryStream(int parameterIndex, InputStream x, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBlob(int parameterIndex, Blob x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBlob(int parameterIndex, InputStream inputStream) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBlob(int parameterIndex, InputStream inputStream, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBoolean(int parameterIndex, boolean x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setByte(int parameterIndex, byte x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setBytes(int parameterIndex, byte[] x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setCharacterStream(int parameterIndex, Reader reader) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setCharacterStream(int parameterIndex, Reader reader, int length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setCharacterStream(int parameterIndex, Reader reader, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setClob(int parameterIndex, Clob x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setClob(int parameterIndex, Reader reader) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setClob(int parameterIndex, Reader reader, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setDate(int parameterIndex, Date x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setDate(int parameterIndex, Date x, Calendar cal) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setDouble(int parameterIndex, double x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setFloat(int parameterIndex, float x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setInt(int parameterIndex, int x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setLong(int parameterIndex, long x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNCharacterStream(int parameterIndex, Reader value) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNCharacterStream(int parameterIndex, Reader value, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNClob(int parameterIndex, NClob value) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNClob(int parameterIndex, Reader reader) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNClob(int parameterIndex, Reader reader, long length) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNString(int parameterIndex, String value) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNull(int parameterIndex, int sqlType) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setNull(int parameterIndex, int sqlType, String typeName) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setObject(int parameterIndex, Object x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setObject(int parameterIndex, Object x, int targetSqlType) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setRef(int parameterIndex, Ref x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setRowId(int parameterIndex, RowId x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setShort(int parameterIndex, short x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setSQLXML(int parameterIndex, SQLXML xmlObject) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setString(int parameterIndex, String x) 
	throws SQLException
    {
	// beware:  java.sql preparedstatement indexes count from 1,
	// and datastax driver counts from 0

	try {
	    m_bs.setString(parameterIndex - 1, x);
	}
	catch (Exception e) {
	    throw new SQLException(e);
	}
    }

    public
	void setTime(int parameterIndex, Time x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setTime(int parameterIndex, Time x, Calendar cal) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setTimestamp(int parameterIndex, Timestamp x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setUnicodeStream(int parameterIndex, InputStream x, int length)
	throws SQLException
    {
	// ============================= DEPRECATED
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }

    public
	void setURL(int parameterIndex, URL x) 
	throws SQLException
    {
	// ============================= UNIMPLEMENTED
	throw new SQLFeatureNotSupportedException();
    }
}
