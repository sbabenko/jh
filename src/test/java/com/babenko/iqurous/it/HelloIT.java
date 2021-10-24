package com.babenko.iqurous.it;

import org.junit.Before;
import org.junit.Test;

public class HelloIT{
	
	private static String port, name;
	
	@Before
	public void setup() {
		port = System.getProperty("servlet.port", "8080");
		name = System.getProperty("artifactId", "test");
	}

}