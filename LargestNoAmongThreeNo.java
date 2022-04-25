public class LargestNoAmongThreeNo {
	public static void main(String[] args) {
		int a=14;
		int b=13; 
		int c=6;
		int largestNo=(a>=b)?((a>=c)?a:b):((b>=c)?b:c);
		//int largestNo=((a>b)?((a>c)?c:a):b);
		
		System.out.println(largestNo);
	}
}
