package com.springbasics.demo.xml;

public class XMLPersonDAO {
	XMLJdbcConnection xmlJdbcConnection;

	public XMLJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XMLJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}

}