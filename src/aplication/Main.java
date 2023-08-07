package aplication;

import java.sql.Connection;

import jdbc.Db;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = Db.getConnection();
		Db.closeConnection();
		System.out.println("deu");
		

	}

}
