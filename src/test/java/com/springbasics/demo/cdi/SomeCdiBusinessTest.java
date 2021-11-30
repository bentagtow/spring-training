package com.springbasics.demo.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import com.springbasics.demo.DemoApplicationBasic;

//Load the context 
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	//create
	@Mock
	SomeCdiDao daoMock;

	//inject
	@InjectMocks
	SomeCdiBusiness business;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		int result = business.findGreatest();
		//call method on binarySearch
		//check if the value is correct
		
		assertEquals(4, result);
	}
	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		int result = business.findGreatest();
		//call method on binarySearch
		//check if the value is correct
		
		assertEquals(Integer.MIN_VALUE, result);
	}
	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		int result = business.findGreatest();
		//call method on binarySearch
		//check if the value is correct
		
		assertEquals(2, result);
	}

}
