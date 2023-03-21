package com.revature.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:test.properties")
class SpringBootDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
