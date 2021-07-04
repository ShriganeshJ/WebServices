package com.js.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.js.beans.Employee;
import com.js.beans.Rooot;

public class ConsumeWS {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		Client client = ClientBuilder.newClient();

		Response rs = client.target("http://dummy.restapiexample.com/api/v1/employees").request().accept(MediaType.APPLICATION_JSON).get();
		
		
		System.out.println(rs.readEntity(String.class));

		ObjectMapper om = new ObjectMapper();

		Rooot rt = om.readValue(rs.readEntity(String.class), Rooot.class);

		List<Employee> emp = rt.getData().stream().filter(i -> i.employee_salary > 10000).collect(Collectors.toList());

		emp.forEach(i -> {
			System.out.println(i.getEmployee_name());
		});

	}

}
