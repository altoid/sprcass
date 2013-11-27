package com.example.cassandra;

import java.util.Calendar;
import java.util.Map;
import java.util.Properties;
import java.util.Iterator;

import java.net.URL;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Time;
import java.sql.Timestamp;

import java.io.Reader;
import java.io.InputStream;

import java.math.BigDecimal;

public class BasicCassResultSet
    implements ResultSet
{
    com.datastax.driver.core.ResultSet m_cass_rs;
    Iterator<com.datastax.driver.core.Row> m_itr;
    com.datastax.driver.core.Row m_currentRow;
    boolean m_isClosed;
    boolean m_beforeFirst;
    boolean m_afterLast;
    boolean m_rsIsEmpty;

    public BasicCassResultSet(com.datastax.driver.core.ResultSet cass_rs)
    {
	m_isClosed = false;
	m_cass_rs = cass_rs;
	m_itr = m_cass_rs.iterator();
	m_currentRow = null;

	// if the RS has no results,
	// beforeFirst and afterLast are always false

	m_rsIsEmpty = !m_itr.hasNext();

	if (m_rsIsEmpty) {
	    m_beforeFirst = false;
	    m_afterLast = false;
	}
	else {
	    m_beforeFirst = true;
	    m_afterLast = false;
	}
    }

    /////////////////////////////////////////////////// ResultSet implementation
    public
	boolean absolute(int row) 
	throws SQLException
    {
	// ===================== UNIMPLEMENTED
	return false;
    }

    public
	void afterLast() 
	throws SQLException
    {
	// ===================== UNIMPLEMENTED
    }

    public
	void beforeFirst() 
	throws SQLException
    {
	// ===================== UNIMPLEMENTED
    }

    public
	void cancelRowUpdates() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void clearWarnings() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void close() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	m_isClosed = true;
    }

    public
	void deleteRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	int findColumn(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	boolean first() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	Array getArray(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Array getArray(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	InputStream getAsciiStream(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	InputStream getAsciiStream(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	BigDecimal getBigDecimal(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		   
	return null;
    }		   
		   
    public	   
	BigDecimal getBigDecimal(int columnIndex, int scale) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		   
	return null;
    }		   
		   
    public	   
	BigDecimal getBigDecimal(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		   
	return null;
    }		   
		   
    public	   
	BigDecimal getBigDecimal(String columnLabel, int scale) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	InputStream getBinaryStream(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	InputStream getBinaryStream(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Blob getBlob(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	     
	return null;
    }	     
	     
    public   
	Blob getBlob(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	boolean getBoolean (int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean getBoolean (String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	byte getByte(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	byte getByte(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	byte[] getBytes(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	byte[] getBytes(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Reader getCharacterStream(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Reader getCharacterStream(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Clob getClob(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Clob getClob(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	int getConcurrency() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	String getCursorName() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Date getDate(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Date getDate(int columnIndex, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	     
	return null;
    }	     
	     
    public   
	Date getDate(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	     
	return null;
    }	     
	     
    public   
	Date getDate(String columnLabel, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	double getDouble(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	double getDouble(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	int getFetchDirection() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	int getFetchSize() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	float getFloat(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	float getFloat(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	int getHoldability() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	int getInt (int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	int getInt (String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	long getLong(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	long getLong(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	ResultSetMetaData getMetaData() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Reader getNCharacterStream(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Reader getNCharacterStream(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	NClob getNClob(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	NClob getNClob(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	String getNString(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	String getNString(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Object getObject(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Object getObject(int columnIndex, Map<String,Class<?>> map) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	       
	return null;
    }	       
	       
    public     
	Object getObject(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	       
	return null;
    }	       
	       
    public     
	Object getObject(String columnLabel, Map<String,Class<?>> map) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Ref getRef(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Ref getRef(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	int getRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	RowId getRowId(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	RowId getRowId(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	      
	return null;
    }	      
	      
    public    
	short getShort(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	      
	return 0;
    }	      
	      
    public    
	short getShort(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	SQLXML getSQLXML(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	SQLXML getSQLXML(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Statement getStatement() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	String getString(int columnIndex) 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("ResultSet is closed");
	}

	// beware:  java.sql ResultSets count columns from 1,
	// the datastax RS counts from 0.

	try {
	    return m_currentRow.getString(columnIndex - 1);
	}
	catch (Exception e) {
	    throw new SQLException(e);
	}
    }

    public
	String getString(String columnLabel) 
	throws SQLException
    {
	if (isClosed()) {
	    throw new SQLException("ResultSet is closed");
	}

	return m_currentRow.getString(columnLabel);
    }

    public
	Time getTime(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Time getTime(int columnIndex, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Time getTime(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED	     
	return null;
    }	     
	     
    public   
	Time getTime(String columnLabel, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	Timestamp getTimestamp(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		  
	return null;
    }		  
		  
    public	  
	Timestamp getTimestamp(int columnIndex, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		  
	return null;
    }		  
		  
    public	  
	Timestamp getTimestamp(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED		  
	return null;
    }		  
		  
    public	  
	Timestamp getTimestamp(String columnLabel, Calendar cal) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	int getType() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return 0;
    }

    public
	InputStream getUnicodeStream(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	InputStream getUnicodeStream(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	URL getURL(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	URL getURL(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	SQLWarning getWarnings() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }

    public
	void insertRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	boolean isAfterLast() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return m_afterLast;
    }

    public
	boolean isBeforeFirst() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return m_beforeFirst;
    }

    public
	boolean isClosed() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return m_isClosed;
    }

    public
	boolean isFirst() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean isLast() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean last() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	void moveToCurrentRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void moveToInsertRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	boolean next() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	if (m_isClosed) {
	    throw new SQLException("result set is closed");
	}

	if (m_rsIsEmpty) {
	    return false;
	}

	if (m_itr.hasNext()) {
	    m_currentRow = m_itr.next();
	    m_beforeFirst = false;
	    return true;
	}
	else {
	    m_currentRow = null;
	    m_afterLast = true;
	}

	return false;
    }

    public
	boolean previous() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	void refreshRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	boolean relative(int rows) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean rowDeleted() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean rowInserted() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	boolean rowUpdated() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	void setFetchDirection(int direction) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void setFetchSize(int rows) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateArray(int columnIndex, Array x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateArray(String columnLabel, Array x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(int columnIndex, InputStream x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(int columnIndex, InputStream x, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(int columnIndex, InputStream x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(String columnLabel, InputStream x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(String columnLabel, InputStream x, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateAsciiStream(String columnLabel, InputStream x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBigDecimal(int columnIndex, BigDecimal x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBigDecimal(String columnLabel, BigDecimal x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(int columnIndex, InputStream x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(int columnIndex, InputStream x, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(int columnIndex, InputStream x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(String columnLabel, InputStream x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(String columnLabel, InputStream x, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBinaryStream(String columnLabel, InputStream x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(int columnIndex, Blob x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(int columnIndex, InputStream inputStream) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(int columnIndex, InputStream inputStream, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(String columnLabel, Blob x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(String columnLabel, InputStream inputStream) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBlob(String columnLabel, InputStream inputStream, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBoolean (int columnIndex, boolean  x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBoolean (String columnLabel, boolean  x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateByte(int columnIndex, byte x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateByte(String columnLabel, byte x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBytes(int columnIndex, byte[] x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateBytes(String columnLabel, byte[] x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(int columnIndex, Reader x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(int columnIndex, Reader x, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(int columnIndex, Reader x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(String columnLabel, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(String columnLabel, Reader reader, int length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateCharacterStream(String columnLabel, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(int columnIndex, Clob x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(int columnIndex, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(int columnIndex, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(String columnLabel, Clob x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(String columnLabel, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateClob(String columnLabel, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateDate(int columnIndex, Date x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateDate(String columnLabel, Date x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateDouble(int columnIndex, double x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateDouble(String columnLabel, double x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateFloat(int columnIndex, float x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateFloat(String columnLabel, float x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateInt (int columnIndex, int x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateInt (String columnLabel, int x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateLong(int columnIndex, long x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateLong(String columnLabel, long x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNCharacterStream(int columnIndex, Reader x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNCharacterStream(int columnIndex, Reader x, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNCharacterStream(String columnLabel, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNCharacterStream(String columnLabel, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(int columnIndex, NClob nClob) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(int columnIndex, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(int columnIndex, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(String columnLabel, NClob nClob) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(String columnLabel, Reader reader) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNClob(String columnLabel, Reader reader, long length) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNString(int columnIndex, String nString) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNString(String columnLabel, String nString) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNull(int columnIndex) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateNull(String columnLabel) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateObject(int columnIndex, Object x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateObject(int columnIndex, Object x, int scaleOrLength) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateObject(String columnLabel, Object x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateObject(String columnLabel, Object x, int scaleOrLength) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateRef(int columnIndex, Ref x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateRef(String columnLabel, Ref x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateRow() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateRowId(int columnIndex, RowId x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateRowId(String columnLabel, RowId x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateShort(int columnIndex, short x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateShort(String columnLabel, short x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateSQLXML(int columnIndex, SQLXML xmlObject) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateSQLXML(String columnLabel, SQLXML xmlObject) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateString(int columnIndex, String x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateString(String columnLabel, String x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateTime(int columnIndex, Time x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateTime(String columnLabel, Time x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateTimestamp(int columnIndex, Timestamp x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	void updateTimestamp(String columnLabel, Timestamp x) 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
    }

    public
	boolean wasNull() 
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    /////////////////////////////////////////////////// Wrapper implementation
    public
	boolean isWrapperFor(Class iface)
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return false;
    }

    public
	<T> T unwrap(Class<T> iface)
	throws SQLException
    {
	// ================================= UNIMPLEMENTED
	return null;
    }
}