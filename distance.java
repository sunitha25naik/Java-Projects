/* Program to create a class DISTANCE with the data members feet and inches. Use a constructor to read the data
and a member function sum() to add two distances by using objects as method arguments and show the result.
( Input and output of inches should be less than 12.)*/

import java.io.*;

class dist
{
	int feet,inches,f1,i1,f2,i2;
	
	dist()
	{
  	  f1=0;
	  f2=0;
          i1=0;
	  i2=0;
	}
	dist(int f, int i)
	{
	feet=f;
	inches=i;
	}



	void  sum(dist d1, dist d2)
	{
	inches=d1.inches+d2.inches;
	feet=inches/12;
	inches=inches%12;
	feet=feet+d1.feet+d2.feet;
	}

	void show()
	{
	System.out.println("sum of" + f1 + "feet" + i1 +"inches" + "and" + f2 + "feet"+ i2 +"inches is :");
	System.out.println(feet + "feet" + "\t" + inches + "inches");
	}
         
	
}



class distance
{

	
	public static void main(String args[])
	{

	
	int f1=0,i1=0,f2=0,i2=0;
	
	
	DataInputStream in=new DataInputStream(System.in);
	try
	{
	System.out.println("enter feet value and inches value of first distance");

	f1=Integer.parseInt(in.readLine());
	i1=Integer.parseInt(in.readLine());


	System.out.println("enter feet value and inches value of second distance");

	f2=Integer.parseInt(in.readLine());
	i2=Integer.parseInt(in.readLine());

	}
	 
	catch (Exception e)
	{ }
    

	dist d1=new dist(f1,i1);
	dist d2=new dist(f2,i2);

	dist d3=new dist();

	if((i1<12)&&(i2<12))
	{
	 
	 d3.sum(d1,d2);

	 d3.show();
        }

        else

	System.out.println("inches is greater than 12 try with lesser values");
    }
}