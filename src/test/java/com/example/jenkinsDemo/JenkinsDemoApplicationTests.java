package com.example.jenkinsDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = JenkinsDemoApplicationTests.class)
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test Executed....");
		assertEquals(true,true);
	}

}
