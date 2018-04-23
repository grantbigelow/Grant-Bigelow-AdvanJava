package JUnit;
public class UnitTestMain {
	public int addInts(int x, int y){
		return x + y;
	}
	public String addStrings(String x, String y) {
		return x+y;
	}
	public int findLen(String x) {
		return x.length();
	}
	public Integer divXByY(int x, int y) {
		if(y == 0)
			return null;
		else
			return x/y;
		
		
	}
	public int [] reverseIntArray(int[] x) {
		int j = 0;
		for(int i= x.length; i>=0; i-- ) {
			x[j] = x[i];
			j++;
		}
		return x;
	}
}
