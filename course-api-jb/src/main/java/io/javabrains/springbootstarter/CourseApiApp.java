package io.javabrains.springbootstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This is very important phase this is the entry point of this application By declaring this Annotation this class will be the starting point
public class CourseApiApp {

	public static void main(String[] args) {
		//System.out.print("Hii");
		SpringApplication.run(CourseApiApp.class, args); // this is very important without this setting App will not run

	}

}
