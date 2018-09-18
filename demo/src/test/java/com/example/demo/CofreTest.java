package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CofreTest {
	
	@Autowired
	Cofre cofre;
	

	@Test
	public void test() {
		//Cofre cofre = new Cofre();
		assertEquals(2, cofre.Moeda(1, 1));
	}

}
