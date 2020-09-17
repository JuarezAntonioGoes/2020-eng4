package br.edu.univas.utils;

public class DataBaseConnection {

	private static DataBaseConnection instance;
	
	private final String URL = "http://127.0.0.1";
	private final String PORT = "5432";
	private final String DATABASE_NAME = "univas";
	private final String USERNAME = "joao";
	private final String PASSWORD = "joao123";
	
	private DataBaseConnection() {
		super();
	}
	
	public static DataBaseConnection getInstance() {
		if (instance == null) {
			instance = new DataBaseConnection();
		}
		return instance;
	}
	
	public String getDataBaseUrl() {
		return URL + ":" + 
			   PORT + "/" +
			   DATABASE_NAME + "/" +
			   USERNAME + "@" +
			   PASSWORD;
	}
}
