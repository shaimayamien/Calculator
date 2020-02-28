package Calculator;
import  java.util.Scanner;

public class Calculator{
    public Calculator () 
  {
	  
  }
    public  static int add (int a, int b) 
  	{
 	return a+b;
 	}
  
   public static void main(String args[])
   {
       Calculator myCalculator = new Calculator();
  
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter a number: ");
        int b = input.nextInt();
        System.out.println(myCalculator.add(a,b));
   }

}