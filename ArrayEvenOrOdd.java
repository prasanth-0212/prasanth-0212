import java.util.Arrays;

public class ArrayEvenOrOdd {

	public static void main(String[] args) {
		int evenCount=0, oddCount=0;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Input Array : "+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		int even[]= new int[evenCount];
		int j=0,k=0;
		int odd[]= new int[oddCount];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[j]=arr[i];
				j++;
			} else {
				odd[k]=arr[i];
				k++;
			}
		}
		System.out.println("Even Array : "+Arrays.toString(even));
		System.out.println("Odd Array : "+Arrays.toString(odd));
	}
}
