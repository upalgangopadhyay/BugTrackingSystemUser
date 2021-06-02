/*package com.cg.bts.Client;
	import org.springframework.web.client.RestTemplate;

import com.cg.bts.entities.Employee;

	public class RestClient {

		private static RestTemplate restTemplate = new RestTemplate();
		private static final String baseURL = "http://localhost:8080/api/employees";

		public static void main(String[] args) {
			
			RestClient rc = new RestClient();
			rc.getEmployees();
			rc.getEmployeeById();
//			rc.createEmployee();
//			rc.updateEmployee();
//			rc.deleteEmployee();	
		}

		public void getEmployees() {
	        String result = restTemplate.getForObject(baseURL, String.class);       
	        System.out.println(result);
		}
		
		public void getEmployeeById() {
		    Employee emp = restTemplate.getForObject(baseURL+"/{id}", Employee.class, 26);
		    System.out.println(emp);
		}

		public void createEmployee() {
			Employee newEmployee = new Employee("Martin", "Richards", "martin@xyz.com");     
		    Employee emp = restTemplate.postForObject(baseURL, newEmployee, Employee.class);
		    System.out.println(emp);
		}

		public void updateEmployee() {
			 Employee updatedEmployee = new Employee("William", "Smith", "wills@xyz.com");		     
			 restTemplate.put(baseURL+"/{id}", updatedEmployee, 26);		
		}

		public void deleteEmployee() {
		    restTemplate.delete(baseURL+"/{id}", 102);
		}
		
	}

*/