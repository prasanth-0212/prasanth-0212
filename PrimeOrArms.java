
public class PrimeOrArms {
	public static void main(String[] args) {
		int num = 370;
		int remainder, arm = 0;
		boolean prime = true;
		int temp = num, temp1 = num;
		for (int i = 2; i < temp; i++) {
			if (temp % i == 0) {
				prime = false;
				break;
			}
		}
		while (temp1 != 0) {
			remainder = temp1 % 10;
			arm += Math.pow(remainder, 3);
			temp1 /= 10;
		}
		if (prime && arm == num) {
			System.out.println("prime and Amrstrong");
		} else if (prime && arm != num) {
			System.out.println("prime but not armstrong");
		} else if (arm == num) {
			System.out.println("Armstrong but not prime");
		} else {
			System.out.println("Neither Armstrong nor prime");
		}
	}
}
