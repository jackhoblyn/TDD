package test;

import org.junit.Test;
import org.junit.Assert;
import tdd.FizzBuzzConverter;

public class FizzBuzztest {
	
	//Program that prints out numbers from 1-100
	//For multiples of three, print 'Fizz'
	//For multiples of five print 'Buzz'
	//For multiples of three and five print 'FizzBuzz'
	
	@Test
	public void fizzBuzzConvertorLeavesNUmbersAlone() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		Assert.assertEquals("1", fizzBuzz.convert(1));
		
		
		
	}
	
	@Test
	public void fizzBuzzConvertorMultipleOfThree() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		Assert.assertEquals("Fizz", fizzBuzz.convert(3));
		
		
		
	}
	
	@Test
	public void fizzBuzzConvertorMultipleOfFive() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		Assert.assertEquals("Buzz", fizzBuzz.convert(5));
		
		
		
	}
	
	@Test
	public void multipleOfBothThreeAndFive() {
		
		FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
		
		Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
		
		
		
	}
	

}
