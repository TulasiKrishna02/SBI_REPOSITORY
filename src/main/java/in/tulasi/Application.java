package in.tulasi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	

	int i=10;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Java Program");
	}

}
