package tech.saturdev.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieinfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieinfoserviceApplication.class, args);
	}

}
