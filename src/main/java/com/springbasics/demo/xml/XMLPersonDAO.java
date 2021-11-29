package com.springbasics.demo.xml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XMLPersonDAO {
	XMLJdbcConnection xmlJdbcConnection;

	public XMLJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XMLJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}

}