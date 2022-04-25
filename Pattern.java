
public class Pattern {
	public static void main(String[] args) {
		int hashCount=4,atCount=1;
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<hashCount;j++) {
				System.out.print('#');
			}
			for (int j = 0; j < atCount; j++) {
				System.out.print('@');
				
			}
			for (int j = 0; j < hashCount; j++) {
				System.out.print('#');
			}
			hashCount--;
			atCount+=2;
			System.out.println();
		}
		
	}

}
//####@####
//###@@@###
//##@@@@@##
//#@@@@@@@#
//@@@@@@@@@