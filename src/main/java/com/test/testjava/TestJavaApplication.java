package com.test.testjava;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class TestJavaApplication {


	@SneakyThrows
	public static void main(String[] args) {
		SpringApplication.run(TestJavaApplication.class, args);
		while (true) {
			log.info(InetAddress.getLocalHost().getHostName());
			log.debug(LocalDateTime.now().toString());
			log.info("This is an info message in log");
			log.warn(LocalDateTime.now().toString());
			log.warn("This is an warning message in log");
			log.error("This is an Error message  in log");
			Thread.sleep(5000);
		}
	}

}
