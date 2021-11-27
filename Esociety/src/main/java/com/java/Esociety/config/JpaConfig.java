package com.java.Esociety.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JpaConfig {

    @Bean
    public DataSource dataSource(){

        DataSourceBuilder dataSourceBuilder= DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("2000");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/esociety");
        return dataSourceBuilder.build();
    }
}
