class Example_Formal_Actualargument
{
public static void main(String[] args)
{
short a=1;
odd(a,1.25);
even();
}

public static void odd(int a,double c)
{
System.out.println("odd");
}

public static void even()
{
odd(10,1.25);
System.out.println("Even");
}
}