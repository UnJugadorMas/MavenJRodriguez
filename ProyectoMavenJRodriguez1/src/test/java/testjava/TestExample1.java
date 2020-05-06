package testjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExample1 {

	   @Test            
	   public void testNumber() {                         
	      assertEquals(5, Example1.getNumber());            
	   }
	   @Test            
	   public void testMeaningfulText () {                         
	      assertEquals("Hello World", Example1.getMeaningfulText ());            
	   }

}
