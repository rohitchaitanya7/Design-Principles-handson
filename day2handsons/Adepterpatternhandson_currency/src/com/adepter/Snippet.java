package com.adepter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Snippet {
 @Test 
 public void testfordollertorupee() 
	{ 
	Rupees rupee = new Rupeesimp();
	Doller Doller = new CorrencyAdapterImpl(rupee);	
	assertEquals(Doller.getconvert(), 150, 0.00001);
	}
}

