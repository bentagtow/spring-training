package com.springbasics.demo.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
