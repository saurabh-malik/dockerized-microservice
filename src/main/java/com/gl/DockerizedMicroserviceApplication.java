/**
 * 
 */
package com.gl;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author saurabh.malik
 *
 */
@SpringBootApplication
public class DockerizedMicroserviceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(DockerizedMicroserviceApplication.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        LOGGER.info("Microservice service started-----");
        SpringApplication.run(DockerizedMicroserviceApplication.class, args);

    }

    /**
     * @return
     */
    @Bean
    public RestTemplate tpRestTemplate() {
        return new RestTemplate();

    }
}
