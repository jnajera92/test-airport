package com.myairline.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.myairline.airport",
        "com.myairline.airport.adapter.persistence",
        "com.myairline.airport.application"
})
@EnableJpaRepositories(basePackages = "com.myairline.airport.adapter.persistence.port") // Para los repositorios JPA
@EntityScan(basePackages = "com.myairline.airport.adapter.persistence.entity")
@EnableConfigurationProperties
public class AirportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirportApplication.class, args);
    }

}
