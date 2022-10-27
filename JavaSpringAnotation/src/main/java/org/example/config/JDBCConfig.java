package org.example.config;

import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JDBCConfig {

    // 管理第三方bean
    @Bean
    public DataSource dataSource()
    {
        return null;
    }
}
