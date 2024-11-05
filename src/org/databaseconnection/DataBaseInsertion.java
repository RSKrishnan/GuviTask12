package org.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DataBaseInsertion {
	public static void main(String[] args) {
		// Syntax for URL
		// "jdbc:myqsl://+host+":"+port+"/dataBaseName
		try {
			String url = "jdbc:mysql://localhost:3306/guvijat9";
			String username = "root";
			String password = "Java@0504";
			// creating a connection to Mysql
			Connection conn = DriverManager.getConnection(url, username, password);
			// Creating Statement object
			Statement createStmt = conn.createStatement();
			// executeUpdate method is used to insert the values in table emp
			createStmt.executeUpdate("insert into empDetails values(101,'Jenny',25,10000);");
			createStmt.executeUpdate("insert into empDetails values(102,'Jacky',30,20000);");
			createStmt.executeUpdate("insert into empDetails values(103,'Joe',20,40000);");
			createStmt.executeUpdate("insert into empDetails values(104,'John',40,80000);");
			createStmt.executeUpdate("insert into empDetails values(105,'SHammer',25,90000);");
			System.out.println("Update executed Successfully!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
