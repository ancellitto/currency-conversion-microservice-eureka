
/**
 * Eureka Naming server which will act as a service discovery for the microservices
 * @author ancel litto
 */
package com.ancel.microservice.eureka.currencyconversioneurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CurrencyConversionEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionEurekaNamingServerApplication.class, args);
	}

}

