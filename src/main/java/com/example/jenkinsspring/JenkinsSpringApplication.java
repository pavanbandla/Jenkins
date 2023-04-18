package com.example.jenkinsspring;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication {


  public static Logger logger = LoggerFactory.getLogger(JenkinsSpringApplication.class);

  @PostConstruct
  public void init(){
      logger.info("Application Starting.... Sir");
      logger.info(" HEllo This is JOhnwick");
  }
    public static void main(String[] args) {
        logger.info("Application Executing........ Sir");
        SpringApplication.run(JenkinsSpringApplication.class, args);
    }

}
