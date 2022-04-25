import java.util.Arrays;

public class ArrayPairs {
	
	public static void main(String args[]) {
		int count=0;
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					int sum=arr[i]+arr[j];
					if(sum%5==0) {
						count++;
						int arrr[]= new int[2];
						arrr[0]= arr[i];
						arrr[1]= arr[j];
						System.out.println(Arrays.toString(arrr));			
					}	
				}
			}
		}
		System.out.println("count is :"+count);
	}
}