import java.util.*;

public class ArmStrongTwoIntervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lowest Number");
		int low = sc.nextInt();
		System.out.println("Enter the highest Number");
		int high = sc.nextInt();
		for (int i = low; i <= high; i++) {
			int remainder = 0, arm = 0;
			int temp = i;
			int temp1 = i;
			int digits = 0;
			while (temp != 0) {
				temp /= 10;
				digits++;
			}
			while (temp1 != 0) {
				remainder = temp1 % 10;
				arm += Math.pow(remainder, digits);
				temp1 /= 10;
			}
			if (i == arm) {
				System.out.println(i);
				for (int arr : i) {

				}
			}
			// if(arm==low) {
			// System.out.println(+arm);
		}
	}

}
