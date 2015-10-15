package com.m2i.formation.tests;

import org.junit.*;

import org.junit.Test;

import com.m2i.formation.media.entities.*;

public class EntitiesTests {

	@Test
	public void test() {
		
		Book b= new Book();
		b.setId(3);
		Assert.assertEquals(3,b.getId());
	}
	
	@Test
	public void vatPriceTest() {
		Media m = new Cd();
		m.setPrice(10.0);

		Assert.assertEquals(12.0,m.getVATPrice(),0.001);//
	}

	@Test
	public void testFirstTest() {
		Book b=new Book();
		int eval = b.getEvaluation();
		Assert.assertEquals(0, eval);
	}

}
