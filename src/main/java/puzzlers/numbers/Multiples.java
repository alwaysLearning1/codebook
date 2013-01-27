package puzzlers.numbers;

public class Multiples {
	static final int calculate(int x) {
		int numberOfLoops = x/15;
		if (x%15 != 0) {
			numberOfLoops++;
		} 
		int sum=0;
		for(int i=1; i<numberOfLoops; i++) {
			sum +=(15*i);
		}
		return sum;
	}
}
