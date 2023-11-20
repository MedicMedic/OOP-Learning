package objectoriented;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class AccountRun 
{
	public static void main(String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("account1 balance: ");
		double acc1bal = input.nextDouble();
		System.out.print("account2 balance: ");
		double acc2bal = input.nextDouble();
		
		String pattern = "$#,###.00";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		
		System.out.println("\naccount1 balance: " + decimalFormat.format(acc1bal));
		System.out.println("account2 balance:" + decimalFormat.format(acc2bal));
		
		int counter = 1;
		String error="";
		
		while (counter <= 2)
		{
			System.out.print("\nEnter withdrawal amount from account" + counter + " balance: ");
			double withdraw = input.nextDouble();
			if (counter == 1) 
			{
				if (withdraw <= acc1bal)
				{
					acc1bal = Account.debit(withdraw, acc1bal);
					error = "";
				}
				else
				{
					error = "Debit amount exceeded account balance.\n";
				}
			}
			else if (counter == 2)
			{
				if (withdraw <= acc2bal)
				{
					acc2bal = Account.debit(withdraw, acc2bal);
					error = "";
				}
				else
				{
					error = "Debit amount exceeded account balance.\n";
				}
			}
			
			System.out.println("\nsubtracting " + decimalFormat.format(withdraw) + " from account" + counter + " balance");
			System.out.print(error);
			System.out.println("account1 balance: " + decimalFormat.format(acc1bal));
			System.out.println("account2 balance:" + decimalFormat.format(acc2bal));
			counter++;
		}
		
	}
}