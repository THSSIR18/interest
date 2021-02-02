import java.util.Scanner;
public class Interest
{
	public static void main(String[] args)
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Interest Computation... ");
		System.out.print("Enter the principal: ");
		double prin = sc.nextDouble();
		System.out.print("Enter the Interst rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time: ");
		int time = sc.nextInt();
		if (time <= 0)
		{
			System.out.println("The time is less or equal to than zero");
		}
		else	
		{
		
			double total = rate * time * prin;
			System.out.println("The total is $" + total);
		}
	}
}

