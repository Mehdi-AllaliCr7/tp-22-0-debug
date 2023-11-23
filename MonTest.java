package tp1_test;

import org.junit.Assert;
import org.junit.Test;

public class MonTest {
	
		@Test
		public void Test1() {
			Assert.assertEquals("1", FizzBuzz.FizzBuzz(1));
		}
		
		@Test
		public void Test2() {
			Assert.assertEquals("2", FizzBuzz.FizzBuzz(2));
		}
		
		@Test
		public void Test4() {
			Assert.assertEquals("4", FizzBuzz.FizzBuzz(4));
		}
		
		@Test
		public void Test3() {
			Assert.assertEquals("3", FizzBuzz.FizzBuzz(3));
		}
		
	}


