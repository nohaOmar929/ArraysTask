import javax.swing.JOptionPane;

public class ArrOfString {

	public static void main (String[] args){
		
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

		
		
	}//end Main
}// end class
