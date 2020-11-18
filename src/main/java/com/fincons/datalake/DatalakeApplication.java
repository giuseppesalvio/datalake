package com.fincons.datalake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatalakeApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(DatalakeApplication.class, args);
  }
}
