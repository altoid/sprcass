package com.example.cassandra;

import java.util.Map;

// this class provides functionality to read map-valued columns from 
// a datastax row and pass them intact to jdbc.

public interface ICassMapReader
{
    /*
      the value for columnIndex will follow the same convention as columnIndexes elsewhere
      in JDBC - we number them starting from 1.
     */
    public <K, V> Map<K, V> getMap(int columnIndex, Class<K> keyClass, Class<V> valueClass)
	throws java.sql.SQLException;
    
    public <K, V> Map<K, V> getMap(String columnLabel, Class<K> keyClass, Class<V> valueClass)
	throws java.sql.SQLException;
}
