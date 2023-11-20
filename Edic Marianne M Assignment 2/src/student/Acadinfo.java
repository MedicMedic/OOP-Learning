package student;

public class Acadinfo 
{
	public static String [] studentnum;
	public static double [] quiz1, quiz2, midterm, _final, average, attendance;
	
	public static void Acadinfo()
	{
		studentnum = new String [2];
		quiz1 = new double [2];
		quiz2 = new double [2];
		midterm = new double [2];
		_final = new double [2];
		average = new double [2];
		attendance = new double [2];
	}
	public static void displayEducDetails(int counta)
	{
		System.out.println("\nSTUDENT EDUCATION DETAILS\nStudent Number " + studentnum [counta] +
		"\nStudent Grade Average: " + average[counta] + "\nStudent Attendance: " + attendance[counta] + "%\n\n" );
	}
}
