package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import inneranon.Outer;
import inneranon.Outer.Inner;



@DisplayName("InnerAnon")
class InnerAnonTest {
	Outer outer;
	Outer.Inner inner;
	
	//SET UP
	@BeforeEach
	void init() {
		//create instances of the classes
		outer = new Outer();
		inner = outer.new Inner();
	}

	
	@Test
	@DisplayName("addNumbers returns sum of values")
	void addTest() {
		int expect = 2;
		int actual = inner.addNumbers(1,1);
		assertEquals(actual,expect,"add should return 2");
	}
	
	@Test
	@DisplayName("multiplyNumbers returns product of values")
	void multiplyTest() {
		int expect = 10;
		int actual = inner.multiplyNumbers(2,5);
		assertEquals(actual, expect,"should return 10");
	}

}
