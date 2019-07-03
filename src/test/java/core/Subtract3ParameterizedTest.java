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


public class Subtract3ParameterizedTest {
	
	@Parameters(name = "Parameter # {index}: {1} - {2} - {3} = {0}")
	
	public static Collection<Double[]>subtractNumbers() {
		
		return Arrays.asList(new Double[][] {
			
			{1.0,4.0,1.0,2.0},  // { 0.5, 1.0, 2.0 }, 
			{1.0,5.0,3.0,1.0},  // { 0.66, 2.0, 3.0 }, 
			{1.0,7.0,3.0,3.0}, //  { 0.75, 3.0, 4.0 }, 
			{1.0,9.0,6.0,2.0} //  { 0.8, 4.0, 5.0 },
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
	
	public void subtract() {
		System.out.println(first + " - " + second +  " - " + third +  " = " + expected);
		
		assertEquals("Not correct", Calculator.subtract(first, second, third), expected, 0.09);
		
	}
	

}

