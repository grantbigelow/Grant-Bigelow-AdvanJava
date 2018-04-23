package JUnit;
import static org.junit.Assert.*;

import org.junit.Test;
public class UnitTests {
	@Test
	public void addInts() {
		UnitTestMain ut = new UnitTestMain();
		int a = 1;
		int b = 2;
		int add = ut.addInts(a, b);
		int expected = a + b;
		String statement = "" + add;
		int expected2 = 1 + Integer.MAX_VALUE;
		assertEquals(expected, add);
		assertFalse(""+ut.addInts(1, Integer.MAX_VALUE), true);
	}
	@Test
	public void addStrings() {
		UnitTestMain ut = new UnitTestMain();
		String a = "a";
		String b = "b";
		String add = a+b;
		String expected = "ab";
		assertEquals(expected, add);
		assertFalse(expected, false);
	}
	@Test
	public void findLen() {
		UnitTestMain ut = new UnitTestMain();
		String a = "";
		String b = "b";
		int A = ut.findLen(a);
		int B = ut.findLen(b);
		int expected1 = a.length();
		int expected2 = b.length();
		assertEquals(expected1,A);
		assertEquals(expected2,B);
		assertFalse(""+expected1,false);
	}
	@Test
	public void divXByY() {
		UnitTestMain ut = new UnitTestMain();
		int a = 1;
		int b = 2;
		int c = 0;
		Integer div = ut.divXByY(a, b);
		Integer div2 = ut.divXByY(b, c);
		Integer expected = 1/2;
		Integer expected2 = null;
		assertEquals(expected, div);
		assertEquals(expected2, div2);
		assertFalse(""+expected, false);
	}
	@Test
	public void reverseIntArray() {
		UnitTestMain ut = new UnitTestMain();
		int aSum = 0;
		int bSum = 0;
		int [] a = {1,2,3,4};
		for(int i = 0; i<a.length; i++) {
			 aSum += a[i];
		}
		int [] b = ut.reverseIntArray(a);
		for(int j = 0; j<b.length; j++) {
			 bSum += b[j];
		}
		assertEquals(a,b);
	}
	
}
