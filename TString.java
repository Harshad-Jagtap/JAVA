//string return type
import java.util.Scanner;
class TString
{
public static void main(String[] args)
{
System.out.println(Example2());
}

public static String Example2()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character you want to print");
char a=sc.nextcharAt();
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
return "The given character is vowel";
}
else 
return "The given character is not vowel";
}
}
