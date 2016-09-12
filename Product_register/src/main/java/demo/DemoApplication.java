package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

	public static void main(String[] args) {
		// Will configure using product-server.yml
        System.setProperty("spring.config.name", "product-server");
        SpringApplication.run(DemoApplication.class, args);
	}
}
