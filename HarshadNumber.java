//harshad number
import java.util.Scanner;
class HarshadNumber
{
public static void main(String[] args)
{
Harshad();
}

public static void Harshad()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number ");

int n=sc.nextInt();
int n1=n;
int rem,sum=0;

    while(n1!=0)
    {
     rem=n%10;
     sum=sum+rem;
     n1=n1/10;
     }
       if(n1==sum)
       {
       System.out.println("its a harshad  number ");
       }
       else
       {
       System.out.println("its not an harshad  number ");
       }
     }
}