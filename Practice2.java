import java.util.Scanner;
public class Practice2 {
	
	public static void main(String args[]) {
		int[] arr= {50,45,55,66,35,78,98,99,56,55};
		int[] arr1= {76,87,49,38,87,90,33,25,41,54};
		int arrCount=0,arr1Count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]>arr1[j]) {
					arrCount++;
					break;
				}
				else {
					arr1Count++;
					break;
				}
			}
			
		}
		String temp=(arrCount>arr1Count)?  "arrCount" : "arr1Count";
		System.out.println("arr1Count:"+arr1Count);
		System.out.println("arrCount"+arrCount);
		System.out.println("Winner is:"+temp);
	}

}
