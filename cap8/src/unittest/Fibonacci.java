package unittest;

public class Fibonacci {

	static final int sequence(int n) {
		int seq = 0;
		int sum = 0;
		int n1 = 0;
		int n2 = 1;

		while (seq < n-1) {

			sum = n1 + n2;
			if (seq % 2 == 0) {
				n1 = sum;
			} else {
				n2 = sum;
			}

			seq++;
		}

		return sum;
	}
}
