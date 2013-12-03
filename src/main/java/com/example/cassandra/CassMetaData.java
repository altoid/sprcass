package com.example.cassandra;

import java.sql.RowIdLifetime;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

public class CassMetaData
    implements java.sql.DatabaseMetaData
{
    public CassMetaData()
    {
    }
    
    /////////////////////////////////////////////////// DatabaseMetaData implementation
    public
	boolean allProceduresAreCallable() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean allTablesAreSelectable() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean autoCommitFailureClosesAllResultSets() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean dataDefinitionCausesTransactionCommit() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean dataDefinitionIgnoredInTransactions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean deletesAreDetected(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean doesMaxRowSizeIncludeBlobs() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getCatalogs() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getCatalogSeparator() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getCatalogTerm() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getClientInfoProperties() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	Connection getConnection() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable, 
				    String foreignCatalog, String foreignSchema, String foreignTable) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	int getDatabaseMajorVersion() 
    {
	return 2;
    }

    public
	int getDatabaseMinorVersion() 
    {
	return 0;
    }

    public
	String getDatabaseProductName() 
    {
	return "Cassandra";
    }

    public
	String getDatabaseProductVersion() 
    {
	return "2.0";
    }

    public
	int getDefaultTransactionIsolation() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getDriverMajorVersion() 
    {
	return 0;
    }

    public
	int getDriverMinorVersion() 
    {
	return 1;
    }

    public
	String getDriverName() 
    {
	return "My Cass Driver";
    }

    public
	String getDriverVersion() 
    {
	return "0.1";
    }

    public
	ResultSet getExportedKeys(String catalog, String schema, String table) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getExtraNameCharacters() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getIdentifierQuoteString() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getImportedKeys(String catalog, String schema, String table) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	int getJDBCMajorVersion() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getJDBCMinorVersion() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxBinaryLiteralLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxCatalogNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxCharLiteralLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnsInGroupBy() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnsInIndex() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnsInOrderBy() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnsInSelect() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxColumnsInTable() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxConnections() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxCursorNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxIndexLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxProcedureNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxRowSize() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxSchemaNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxStatementLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxStatements() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxTableNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxTablesInSelect() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	int getMaxUserNameLength() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	String getNumericFunctions() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getPrimaryKeys(String catalog, String schema, String table) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getProcedureTerm() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	int getResultSetHoldability() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	RowIdLifetime getRowIdLifetime() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getSchemas() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getSchemas(String catalog, String schemaPattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getSchemaTerm() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getSearchStringEscape() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getSQLKeywords() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	int getSQLStateType() 
    {
	// ============================ UNIMPLEMENTED
	return 0;
    }

    public
	String getStringFunctions() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getSystemFunctions() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getTableTypes() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getTimeDateFunctions() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getTypeInfo() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int [] types) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getURL() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	String getUserName() 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	ResultSet getVersionColumns(String catalog, String schema, String table) 
    {
	// ============================ UNIMPLEMENTED
	return null;
    }

    public
	boolean insertsAreDetected(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean isCatalogAtStart() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean isReadOnly() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean locatorsUpdateCopy() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean nullPlusNonNullIsNull() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean nullsAreSortedAtEnd() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean nullsAreSortedAtStart() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean nullsAreSortedHigh() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean nullsAreSortedLow() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean othersDeletesAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean othersInsertsAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean othersUpdatesAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean ownDeletesAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean ownInsertsAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean ownUpdatesAreVisible(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesLowerCaseIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesLowerCaseQuotedIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesMixedCaseIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesMixedCaseQuotedIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesUpperCaseIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean storesUpperCaseQuotedIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsAlterTableWithAddColumn() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsAlterTableWithDropColumn() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsANSI92EntryLevelSQL() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsANSI92FullSQL() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsANSI92IntermediateSQL() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsBatchUpdates() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCatalogsInDataManipulation() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCatalogsInIndexDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCatalogsInPrivilegeDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCatalogsInProcedureCalls() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCatalogsInTableDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsColumnAliasing() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsConvert() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsConvert(int fromType, int toType) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCoreSQLGrammar() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsCorrelatedSubqueries() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsDataDefinitionAndDataManipulationTransactions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsDataManipulationTransactionsOnly() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsDifferentTableCorrelationNames() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsExpressionsInOrderBy() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsExtendedSQLGrammar() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsFullOuterJoins() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsGetGeneratedKeys() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsGroupBy() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsGroupByBeyondSelect() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsGroupByUnrelated() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsIntegrityEnhancementFacility() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsLikeEscapeClause() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsLimitedOuterJoins() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMinimumSQLGrammar() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMixedCaseIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMixedCaseQuotedIdentifiers() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMultipleOpenResults() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMultipleResultSets() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsMultipleTransactions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsNamedParameters() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsNonNullableColumns() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOpenCursorsAcrossCommit() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOpenCursorsAcrossRollback() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOpenStatementsAcrossCommit() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOpenStatementsAcrossRollback() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOrderByUnrelated() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsOuterJoins() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsPositionedDelete() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsPositionedUpdate() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsResultSetConcurrency(int type, int concurrency) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsResultSetHoldability(int holdability) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsResultSetType(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSavepoints() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSchemasInDataManipulation() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSchemasInIndexDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSchemasInPrivilegeDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSchemasInProcedureCalls() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSchemasInTableDefinitions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSelectForUpdate() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsStatementPooling() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsStoredFunctionsUsingCallSyntax() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsStoredProcedures() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSubqueriesInComparisons() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSubqueriesInExists() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSubqueriesInIns() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsSubqueriesInQuantifieds() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsTableCorrelationNames() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsTransactionIsolationLevel(int level) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsTransactions() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsUnion() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean supportsUnionAll() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean updatesAreDetected(int type) 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean usesLocalFilePerTable() 
    {
	// ============================ UNIMPLEMENTED
	return false;
    }

    public
	boolean usesLocalFiles() 
    {
	// ============================ UNIMPLEMENTED
	return false;
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
