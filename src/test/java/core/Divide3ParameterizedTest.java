package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)


public class Divide3ParameterizedTest {
	
	@Parameters(name = "Parameter # {index}: {1} / {2} / {3} = {0}")
	
	public static Collection<Double[]>divideNumbers() {
		
		return Arrays.asList(new Double[][] {
			
			{1.0,3.0,2.0,1.5},  // { 0.5, 1.0, 2.0 }, 
			{1.0,6.0,3.0,2.0},  // { 0.66, 2.0, 3.0 }, 
			{1.0,12.0,4.0,3.0}, //  { 0.75, 3.0, 4.0 }, 
			{1.0,24.0,4.0,6.0} //  { 0.8, 4.0, 5.0 },
		});
	}
	
	@Parameter(value = 0) 
	public Double expected;
	
	@Parameter(value = 1)
	public Double first;
	
	@Parameter(value = 2) 
	public Double second;
	
	@Parameter(value = 3)
	public Double third; 
	
	@Test
	
	public void divide() {
		System.out.println(first + " / " + second + " / " + third  + " = " + expected);
		
		assertEquals("Not correct", Calculator.divide(first, second, third), expected, 0.09);
		
	}
	

}

