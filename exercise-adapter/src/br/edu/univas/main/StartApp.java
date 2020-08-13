package br.edu.univas.main;

import br.edu.univas.adapter.RequestAdapter;
import br.edu.univas.adapter.StudentRequestAdapterImpl;
import br.edu.univas.parser.Request;
import br.edu.univas.parser.StudentRequestImpl;

public class StartApp {

	public static void main(String[] args) {
		Request request = new StudentRequestImpl();
		String studentXML = request.getAllStudents();
		System.out.println(studentXML);
		
		//formato JSON
		System.out.println("\n\n\n\n*********\n\n\n");
		RequestAdapter adapter = new StudentRequestAdapterImpl(request);
		String studentJson = adapter.getAllStudents();
		System.out.println(studentJson);
	}
}
