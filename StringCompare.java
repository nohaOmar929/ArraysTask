import java.util.Scanner;

public class StringCompare {
	
	public static void main(String[] args){
		
	Scanner get = new Scanner(System.in);
	
	System.out.println("Enter first name...");	
	String name = get.next();
	System.out.println("Enter second name...");
	String name2 = get.next();
	
	get.close();
	
	boolean compare = name.equals(name2);
	
	System.out.println("Names similarity " +compare);
	} //end main

} //End class
