import java.util.Scanner;

public class StringContain {
	public static void main(String[] args){
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("Enter first line...");	
		String name = get.next();
		System.out.println("Enter second line...");
		String name2 = get.next();
		
		get.close();
	
		boolean contain = name.contains(name2);
		
		System.out.println("Does Second line contain First line?..."+contain);
		
	}// End main
}// End class
