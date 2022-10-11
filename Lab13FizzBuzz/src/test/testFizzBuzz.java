package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFizzBuzz {

	@Test
	   public void Input1ShouldBe1() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(1);
	      
	      
	      assertEquals(input,"1");
		   }
	
	@Test
	   public void Input2ShouldBe2() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(2);      
	      assertEquals(input,"2");
	      
	}
	@Test
	   public void Input3ShouldBeFizz() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(3);      
	      assertEquals(input,"Fizz");
	      
	}
	
	@Test
	   public void Input4Should4() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(3);      
	      assertEquals(input,"Fizz");
	      
	}
}
