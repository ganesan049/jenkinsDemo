package com.example.jenkinsDemo;

import org.junit.jupiter.api.Test;
import org.junit.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		String obj1="Junit";
		String obj2="Junit";
		logger.info("testcase executing....");
		assertEquals(obj1,obj2);
	}

}
