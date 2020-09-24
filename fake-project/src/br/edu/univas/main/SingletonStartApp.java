package br.edu.univas.main;

import br.edu.univas.utils.DataBaseConnection;

public class SingletonStartApp {

	public static void main(String[] args) {
		//DataBaseConnection connection1 = new DataBaseConnection();
		//System.out.println(connection1.getDataBaseUrl());
		
		//DataBaseConnection connection2 = new DataBaseConnection();
		//System.out.println(connection2.getDataBaseUrl());
		
		for (int i = 0; i < 10; i++) {
			
			DataBaseConnection connection1 = DataBaseConnection.getInstance();
			System.out.println(connection1.getDataBaseUrl());
			
			DataBaseConnection connection2 = DataBaseConnection.getInstance();
			System.out.println(connection2.getDataBaseUrl());
		}
	}
	
}
