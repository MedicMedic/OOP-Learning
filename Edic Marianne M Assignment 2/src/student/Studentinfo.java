package student;

public class Studentinfo 
{
	public static String[]  studentname, address, father, mother, gender, contact;
	public static int[] age;
	public static void Studentinfo()
	{
		studentname= new String [2];
		address= new String [2];
		father= new String [2];
		mother= new String [2];
		gender = new String [2];
		contact = new String [2];
		
		age = new int [2];
	}
					
	public static void display_student(int counts)
	{
		System.out.print("STUDENT DETAILS\nStudent name: " + studentname[counts]
		+ "\nAge: " + age[counts] + "\nStudent Gender: " + gender[counts] + "\nStudent Address: " + address[counts] +
		"\nContact Number : " + contact[counts] + "\nFather's Name: " + father[counts] + "\nMother's Name: "
		+ mother[counts] + "\n");
	}
}
