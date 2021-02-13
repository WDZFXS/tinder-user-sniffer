package com.wdzfxs.db;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(DBProperties.class)
public class DBConfiguration {

    private final DBProperties properties;

    public DBConfiguration(DBProperties properties) {
        this.properties = properties;
    }

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .url(properties.getUrl())
                .username("postgres")
                .password("postgres")
                .driverClassName("org.postgresql.Driver")
                .build();
    }
}