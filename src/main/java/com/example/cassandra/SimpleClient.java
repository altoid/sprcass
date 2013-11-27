package com.example.cassandra;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.BoundStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class SimpleClient 
{
    private Log m_log = LogFactory.getLog(SimpleClient.class);

    private Cluster cluster;
    private Session session;

    public void connect(String node) {
	cluster = Cluster.builder()
            .addContactPoint(node).build();
	Metadata metadata = cluster.getMetadata();
	System.out.printf("Connected to cluster: %s\n", 
			  metadata.getClusterName());
	for ( Host host : metadata.getAllHosts() ) {
	    System.out.printf("Datatacenter: %s; Host: %s; Rack: %s\n",
			      host.getDatacenter(), host.getAddress(), host.getRack());
	}

	session = cluster.connect();
    }

    public void query() 
    {
	ResultSet results = session.execute(
					    "select * from testks.testcf;"
					    );

	for (Row row : results) {
	    System.out.println(String.format("%-20s\t%-20s\t%-30s",
					     row.getString("keeey"),
					     row.getString("column1"),
					     row.getString("value")));
	}

    }

    public void insert()
    {
	PreparedStatement ps = session.prepare(
					       "insert into testks.testcf(keeey, column1, value) " +
					       " values(?,?,?);");
	BoundStatement bs = new BoundStatement(ps);

	bs.bind("heee", "fweee", "aieeee");
	session.execute(bs);
    }

    public void close() {
	cluster.shutdown();
    }

    public static void main(String[] args) 
    {
	SimpleClient client = new SimpleClient();
	try {
	    //	client.connect("dtommcass1.engr.tivo.com");
	    client.connect("10.100.182.166"); // dtommcass1
	    //	client.connect("as01.pfen1.tivo.com");

	    client.insert();

	    client.query();
	}
	finally {
	    client.close();
	}
    }
}