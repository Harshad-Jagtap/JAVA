//count of digit and check count digit is even or odd
import java.util.Scanner;
class Count_Digit
{
public static void main(String[] args)
{
//int a1=count();
//CheckOddEven(a1);
CheckOddEven(count());
}
public static int count()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();
    int c=0;
    while(a>0)
    {
    c++;
    a=a/10;    
    }
    System.out.println("Total count of Digit is "+c);
  return c;
  }
 
     public static void CheckOddEven(int b)
     {
    int a=b;
    if(a%2==0)
    {
    System.out.println("count of number is Even Number ");
    }
    else
    {
    System.out.println("count of number is odd number ");
    }
    }
}


