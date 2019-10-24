
public class uppgift2 {
	public static void main(String[] args) {
		String str = "Johan";
		System.out.println(rerverse(str));
	}
	
	public static String rerverse(String str) {
	String reverseStr = "";
	for(int i = str.length() - 1; i >= 0; i --) {
		 reverseStr += str.charAt(i);	
	}
	return(reverseStr);
	}
}
