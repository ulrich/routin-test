package fr.routin.test;

import org.springframework.boot.SpringApplication;

public class TestRoutinTestApplication {

	public static void main(String[] args) {
		SpringApplication.from(RoutinTestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
