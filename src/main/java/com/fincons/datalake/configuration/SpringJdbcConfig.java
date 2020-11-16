package com.fincons.datalake.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan("com.fincons.datalake.configuration")
public class SpringJdbcConfig {
  //  @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/datalake?serverTimezone=UTC&useLegacyDatetimeCode=false");
        //jdbc:mysql://${MYSQL_HOST:localhost}:3306/datalake?serverTimezone=UTC&useLegacyDatetimeCode=false
        dataSource.setUsername("root");
        dataSource.setPassword("PASSWORD");

        return dataSource;
    }
}
