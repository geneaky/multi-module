package com.example.multimoduletest.db.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {"com.example.multimoduletest.db.domain"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.example.multimoduletest.db.domain"})
public class JpaConfig {

}
