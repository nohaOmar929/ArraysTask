import javax.swing.JOptionPane;

public class Arr {
	
static int [] numbersArr;
	
	
public static void main (String[] args){
	
	////premitive arrays////
	numbersArr = new int [5];
	 
	 numbersArr[0]=1;
	 numbersArr[1]=2;
	 numbersArr[2]=3;
	 numbersArr[3]=4;
	 numbersArr[4]=5;
	 System.out.println("Arrays task.1");
	 
	 System.out.println(numbersArr[0]);
	 System.out.println(numbersArr[1]);
	 System.out.println(numbersArr[2]);
	 System.out.println(numbersArr[3]);
	 System.out.println(numbersArr[4]);
	 
	 //////////////Arrays.2////////////
	 
	 
	 String [] arrData = new String[6]; //array of refrence, declaration and construction at same line
	 
	 String name, email, faculty, department;
	 String mobile, age;
	 
	 name = JOptionPane.showInputDialog("Enter you Name: ");
	 age=JOptionPane.showInputDialog("Enter your age");
	 email = JOptionPane.showInputDialog("Enter your Email");
	 mobile = JOptionPane.showInputDialog("Enter your Mobile");
	 faculty= JOptionPane.showInputDialog("Enter your Faculty");
	 department= JOptionPane.showInputDialog("Enter your Department");
	 
	 
	 arrData[0]= name;
	 arrData[1]=mobile;
	 arrData[2]=age;
	 arrData[3]=email;
	 arrData[4]=faculty;
	 arrData[5]=department;
	 
	 
	 System.out.println("Name: " + arrData[0]);
	 System.out.println("Mobile: " + arrData[1]);
	 System.out.println("age: " + arrData[2]);
	 System.out.println("email: " + arrData[3]);
	 System.out.println("Faculty: " + arrData[4]);
	 System.out.println("Department: " + arrData[5]);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	 
	 

}//end main	

}// end class
