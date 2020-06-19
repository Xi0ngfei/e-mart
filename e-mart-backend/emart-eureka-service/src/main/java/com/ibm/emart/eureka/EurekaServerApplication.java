package com.ibm.emart.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args)throws Exception{
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
