package br.edu.univas.adapter;

import org.json.JSONObject;
import org.json.XML;

import br.edu.univas.parser.Request;

public class StudentRequestAdapterImpl implements RequestAdapter {

	private Request studentRequest;
	
	public StudentRequestAdapterImpl(Request studentRequest) {
		this.studentRequest = studentRequest;
	}
	
	@Override
	public String getAllStudents() {
		String allStudents = studentRequest.getAllStudents();
		
		JSONObject jsonObject = XML.toJSONObject(allStudents);
		
		return jsonObject.toString();
	}

}
