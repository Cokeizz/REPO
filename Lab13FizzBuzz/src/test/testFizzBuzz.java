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
	@Test
	   public void Input5ShouldBuzz() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(5);      
	      assertEquals(input,"Buzz");
	      
	}
	@Test
	   public void Input6Shoul6() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(6);      
	      assertEquals(input,"Fizz");
	      
	}
	@Test
	   public void Input7Should7() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(7);      
	      assertEquals(input,"7");
	      
	}
	@Test
	   public void Input8Should8() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(8);      
	      assertEquals(input,"8");
	      
	}
	@Test
	   public void Input9ShouldFizz() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(9);      
	      assertEquals(input,"Fizz");
	      
	}
	@Test
	   public void Input10ShouldBuzz() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(10);      
	      assertEquals(input,"Buzz");
	      
	}
	@Test
	   public void Input11Should11() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(11);      
	      assertEquals(input,"11");
	      
	}
	@Test
	   public void Input12ShouldFizz() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(12);      
	      assertEquals(input,"Fizz");
	      
	}
	@Test
	   public void Input13Should13() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(13);      
	      assertEquals(input,"13");
	      
	}
	@Test
	   public void Input14Should14() {
	      FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
	      String input = fizzBuzz.convert(14);      
	      assertEquals(input,"14");
	      
	}
}
