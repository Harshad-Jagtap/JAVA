import java.util.Scanner;
class Armstrong 
{

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

        int originalNumber, remainder, result = 0;

        System.out.println("Enter the number");
       int number=sc.nextInt(); 
       originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}