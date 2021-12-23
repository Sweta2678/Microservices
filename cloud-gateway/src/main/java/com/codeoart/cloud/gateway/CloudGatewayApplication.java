package com.codeoart.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
	
	/*
	 * @Bean public Customizer<ReactiveResilience4JCircuitBreakerFactory>
	 * defaultCustomizer() { return factory -> factory.configureDefault(id -> new
	 * Resilience4JConfigBuilder(id) //
	 * .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
	 * .circuitBreakerConfig(CircuitBreakerConfig.custom() .slidingWindowSize(5)
	 * .permittedNumberOfCallsInHalfOpenState(5) .failureRateThreshold(50.0F)
	 * .waitDurationInOpenState(Duration.ofMillis(30)) //
	 * .slowCallDurationThreshold(Duration.ofMillis(200)) //
	 * .slowCallRateThreshold(50.0F) .build())
	 * .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.
	 * ofMillis(200)).build()) .build()); }
	 */
}
