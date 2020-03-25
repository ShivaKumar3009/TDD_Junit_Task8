package com.epam.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.Junit.RemoveA;

class RemoveATest {
	
	/* To Do List
	 *1. 1 char: A -> ""  - success
	 *2. 2 chars: AB -> B - success
	 *3. 4 chars: AABC -> BC - success
	 *4. n chars: ABCDEFG -> BCDEFG - success
	 *5. empty string "" -> "" -uccess
	 * */
	
	RemoveA obj;
	@BeforeEach
	void setup() {
		 obj=new RemoveA();
	}
	
	@Test
	void test1chars() {
		assertEquals("B",obj.removeA("B"));
	}
	
	@Test
	void test2chars() {
		assertEquals("B",obj.removeA("AB"));
	}
	
	@Test
	void test4chars() {
		assertEquals("BC",obj.removeA("AABC"));
	}
	
	@Test
	void testnchars() {
		assertEquals("BCDEFGH",obj.removeA("ABCDEFGH"));
	}

}
