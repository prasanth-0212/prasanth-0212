public class PrimeFibonaccine {
	public static void main(String[] args) {
		int firstnum = 0, secondnum = 1, sum;
		for (int i = firstnum; i <= 50; i++) {
			sum = firstnum + secondnum;
			int count = 0;
			if (sum > 1) {
				for (int j = 2; j < sum; j++) {
					if (sum % j == 0) {
						count++;
					}
				}
				if (count == 0) {
					System.out.print(sum + " ");
				}
			}
			firstnum = secondnum;
			secondnum = sum;
		}
	}
}
