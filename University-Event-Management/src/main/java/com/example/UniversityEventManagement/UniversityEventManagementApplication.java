package com.example.UniversityEventManagement;

import com.example.UniversityEventManagement.EventmanagementService.EventService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityEventManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityEventManagementApplication.class, args);
//		EventService event=new EventService();
//		System.out.println(event.getaeventByDate("20/1/2016"));
	}

}
