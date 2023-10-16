// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class Admin_getName_8400ac6fb7_Test {

	@Mock
	private Admin admin;
	
	@Test
	public void testGetName() {

		when(admin.getName()).thenReturn("Admin1");

		String name = admin.getName();

		Assert.assertNotNull(name);
		Assert.assertEquals("Admin1", name);
	}

	@Test
	public void testGetName_Null() {

		when(admin.getName()).thenReturn(null);

		String name = admin.getName();
		
		Assert.assertNull(name);
	}
}
