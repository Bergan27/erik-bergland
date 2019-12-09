public class v46{
	import java.util.Scanner;
	
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		String [] names  = new String[10];
		
		for (int i = 0; 1 < names.length; i++) {
			names[i] = in.next();	
		}
		
		for (int i = 0; i<namees.lenth; i++) {
			String name = name[i];
			
			for (int j= i+1; j < names.length; j++) {
				String othername = names [j];
				
				if(name.equals(othername)) {
					System.out.println(name);
				}
			}
		}
		
	} 
}
