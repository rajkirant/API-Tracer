package com.trace.api.tracer.rest;



import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tracer {

	@GetMapping("/trace")
	public String Greeting(HttpServletRequest request,@RequestBody Object requestBody) throws IOException{

			Enumeration<String> enm = request.getHeaderNames();
			System.out.println("Headers");
			while(enm.hasMoreElements()){
				String header = enm.nextElement();
			System.out.println(header +":"+ request.getHeader(header));
			}
			System.out.println("---------------------------");
			System.out.println("Request Body");
			System.out.println(requestBody);
		return "success";
	}
}

