//Tech Number
// Enter a Number And Check The Given Value it is Tech Number or Not 
import java.util.Scanner;
class  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number To check it is Tech Number or Not:- ");
		int num=sc.nextInt(),count=1,sum=0,d=num,a=num,div=1,i,a1,a2;
		// Take a Count Of Digit.
		while (d>0)
		{
			count++;
			d=d/10;	
		}
		System.out.println("The Count Of Number is: " +count);
		//Split The number Half of The digit
		for (i=1;i<=count/2;i++)
		{
			 div=div*10;
		}
		 a1=a%div;
		 a2=a/div;
		sum=a1+a2;
		if (num==(sum*=sum))
		{
			System.out.println("Its a Tech Number");
		}
		else
		{
			System.out.println("It's Not a tech Number");
		}
	}
}