package test;

import org.junit.Test;
import org.junit.Assert;
import tdd.FizzBuzzConverter;

public class ActualTest {
	
	@Test
	public void outputTheHundrudFizzBuzzes() {
		
		FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
		for (int i=1; i<=100; i++) {
			System.out.println(fizzbuzz.convert(i));
			
		}
	}

}
