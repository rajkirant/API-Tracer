package com.trace.api.tracer.rest;



import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

@RestController
public class Tracer {


	@PutMapping("/trace")
	public String Greeting(HttpServletRequest request,@RequestBody Object requestBody) throws IOException, ParseException{

			Enumeration<String> enm = request.getHeaderNames();
			System.out.println("Headers");
			while(enm.hasMoreElements()){
				String header = enm.nextElement();
			System.out.println(header +":"+ request.getHeader(header));
			}
			System.out.println("---------------------------");
			System.out.println("Request Body");
			System.out.println(requestBody);
			String response ="{\r\n" + 
					"   \"Header\": {\r\n" + 
					"      \"client_msg_id\": \"971626570000000\",\r\n" + 
					"      \"server_rsp_ts\": \"01/11/2015 04:16:49\"\r\n" + 
					"   },\r\n" + 
					"   \"Body\": {\r\n" + 
					"      \"AccountBalanceInquiryResponse\": {\r\n" + 
					"         \"first_name\": \"Jane\",\r\n" + 
					"         \"middle_initial\": \"R\",\r\n" + 
					"         \"last_name\": \"Doe\",\r\n" + 
					"         \"CoBrandAccount\": {\r\n" + 
					"            \"account_nbr\": \"377412345678912\",\r\n" + 
					"            \"account_status\": \"A\",\r\n" + 
					"            \"open_to_buy_amt\": \"1249.40\",\r\n" + 
					"            \"account_balance\": \"250.60\",\r\n" + 
					"            \"min_payment_due_amt\": \"25.00\",\r\n" + 
					"            \"payment_due_date\": \"02/24/2015\",\r\n" + 
					"            \"last_payment_amt\": \"35.00\",\r\n" + 
					"            \"last_payment_date\": \"01/18/2015\",\r\n" + 
					"            \"last_statement_balance\": \"285.60\",\r\n" + 
					"            \"last_statement_date\": \"01/30/2015\"\r\n" + 
					"         }\r\n" + 
					"      }\r\n" + 
					"   }\r\n" + 
					"}";
			JSONParser parser = new JSONParser(); 
			JSONObject json = (JSONObject) parser.parse(response);

			
		return "success";
	}
	
	@RequestMapping("/trace")
	public JSONObject Greeting(HttpServletRequest request) throws IOException, ParseException{
		System.out.println("start");
			Enumeration<String> enm = request.getHeaderNames();
			System.out.println("Headers");
			while(enm.hasMoreElements()){
				String header = enm.nextElement();
			System.out.println(header +":"+ request.getHeader(header));
			}
			System.out.println("---------------------------");
			System.out.println("Request Body");
			String response ="{\r\n" + 
					"   \"Header\": {\r\n" + 
					"      \"client_msg_id\": \"971626570000000\",\r\n" + 
					"      \"server_rsp_ts\": \"01/11/2015 04:16:49\"\r\n" + 
					"   },\r\n" + 
					"   \"Body\": {\r\n" + 
					"      \"AccountBalanceInquiryResponse\": {\r\n" + 
					"         \"first_name\": \"Jane\",\r\n" + 
					"         \"middle_initial\": \"R\",\r\n" + 
					"         \"last_name\": \"Doe\",\r\n" + 
					"         \"CoBrandAccount\": {\r\n" + 
					"            \"account_nbr\": \"377412345678912\",\r\n" + 
					"            \"account_status\": \"A\",\r\n" + 
					"            \"open_to_buy_amt\": \"1249.40\",\r\n" + 
					"            \"account_balance\": \"250.60\",\r\n" + 
					"            \"min_payment_due_amt\": \"25.00\",\r\n" + 
					"            \"payment_due_date\": \"02/24/2015\",\r\n" + 
					"            \"last_payment_amt\": \"35.00\",\r\n" + 
					"            \"last_payment_date\": \"01/18/2015\",\r\n" + 
					"            \"last_statement_balance\": \"285.60\",\r\n" + 
					"            \"last_statement_date\": \"01/30/2015\"\r\n" + 
					"         }\r\n" + 
					"      }\r\n" + 
					"   }\r\n" + 
					"}";
			JSONParser parser = new JSONParser(); 
			JSONObject json = (JSONObject) parser.parse(response);

			
		return json;
	}
}

