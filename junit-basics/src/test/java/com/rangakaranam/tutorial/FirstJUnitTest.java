package com.rangakaranam.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

class SimpleClass{
	int sumx= 0;
	public int sum(int...n) {
		for(int i:n) {
			sumx += i;
		}
		return sumx;
	}
}
public class FirstJUnitTest {

	@Test
	public void test() {
		//Execute the Code
		SimpleClass sc = new SimpleClass();
		int actualResult = sc.sum(10,15,14,185);
		//Check the output
		assertEquals(224, actualResult);
	}

}
