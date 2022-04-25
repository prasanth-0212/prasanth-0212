public class Pattern1 {
	public static void main(String[] args) {
		int atCount=9,hashCount=0;

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < hashCount; j++) {
				System.out.print("#");
			}
			
			for (int j = 0; j < atCount; j++) {
				System.out.print("@");
			}
			
			for (int j = 0; j < hashCount; j++) {
				System.out.print("#");
			}
			System.out.println();
			atCount-=2;
			hashCount++;
		}		
		
	}
}
//@@@@@@@@@
//#@@@@@@@#
//##@@@@@##
//###@@@###
//####@####



