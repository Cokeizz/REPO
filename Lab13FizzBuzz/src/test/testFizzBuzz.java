package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFizzBuzz {

	@Test
	   public void Input1ShouldBe1() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(1);
	      
	      
	      assertEquals(input,"1");
	      //expect
	   }
}
