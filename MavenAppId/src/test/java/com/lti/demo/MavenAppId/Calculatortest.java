package com.lti.demo.MavenAppId;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculatortest {

	@Test
	public void testAdd1() {
		int res = new Calculate().add(10,20);
		assertEquals(30, res);
	}

}
