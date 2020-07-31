package springboot.helloworld.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"springboot.helloworld.*"})
public class HelloWorldMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMainApplication.class, args);
	}
}
