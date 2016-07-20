package com.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeServiceTest {
	
	@Test
	public void objectTest() {
		WelcomeService service = new WelcomeService();
		
		assertEquals(service, service);
	}
	

}
