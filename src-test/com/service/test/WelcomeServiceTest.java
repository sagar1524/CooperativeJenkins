package com.service.test;

import org.junit.Test;

import com.service.WelcomeService;

import static org.junit.Assert.assertEquals;

public class WelcomeServiceTest {
	
	@Test
	public void objectTest() {
		WelcomeService service = new WelcomeService();
		
		assertEquals(service, service);
	}
	

}
