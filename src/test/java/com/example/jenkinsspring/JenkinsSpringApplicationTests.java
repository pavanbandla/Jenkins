package com.example.jenkinsspring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringApplicationTests {


   public static Logger logger = LoggerFactory.getLogger(JenkinsSpringApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test Case Executed Successfully..... Sir ");
    }

}
