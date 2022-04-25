public class ReverseString {
	public static void main(String[] args) {
		String reverse="Hello World";
		char ch[]=reverse.toCharArray();
		String out=" ";
	for (int i = ch.length-1; i >=0; i--) {
		    out=out+ch[i];
		}
	System.out.println(out);
		}

}
