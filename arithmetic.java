/*A menu driven program to input two integers & an operator to perform basic 
arithmetic operations (+ ,-,* and /) using switch case structure.*/
import java.io.*;
class arithmetic
{
 public static void main(String args[])
 {
  int num1,num2;
  DataInputStream in=new DataInputStream(System.in);
  try
  {
   System.out.println("Enter the Operands:");
   num1=Integer.parseInt(in.readLine());
   num2=Integer.parseInt(in.readLine());

   System.out.println("Select the operator:");

   System.out.println("1.(+).Addition");
   System.out.println("2.(-).Subtraction");
   System.out.println("3.(*).Multiplication");
   System.out.println("4.(/).Division");
   System.out.println("5.Exit");
   char op=in.readLine().charAt(0);
   switch(op)
   {
    case '+':
	     System.out.println("Addition of numbers:"+(num1+num2));
             break;
     
     case '-':
	     System.out.println("Subtraction of numbers:"+(num1-num2));
             break;
     case '*':
	     System.out.println("Multiplication of numbers:"+(num1*num2));
             break;
     case '/':
	     System.out.println("Division of numbers:"+(num1/num2));
             break;
     default:
            System.exit(0);
   }
 }
  catch(Exception e)
  { }
 }
}