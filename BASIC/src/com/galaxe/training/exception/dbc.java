package com.galaxe.training.exception;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.spi.DirStateFactory.Result;

public class dbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection connection = DriverManager.getConnection();
					
			Statement statement = connection.createStatement();
			
			Result rs = statement.executeQuery("select * from");
				
			while(rs.next()) {
				String name = rs.getString();
				int batchId = rs.getInt();
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
