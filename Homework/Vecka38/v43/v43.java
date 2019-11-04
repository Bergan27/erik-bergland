import java.util.Scanner;
import java.lang.Math;
public class v43 {
	
	public static void main(String[] args) {
			System.out.println(volume(5)+" Liter");
			String str = "Johan";
			System.out.println(rerverse(str));
			
		}
		
	public static double volume(double radius){
		return (4 * Math.PI * Math.pow(radius, 3))/3;
	
	}
	
	public static String rerverse(String str) {
		String reverseStr = "";
		for(int i = str.length() - 1; i >= 0; i --) {
		 reverseStr += str.charAt(i);	
		}
		return(reverseStr);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

