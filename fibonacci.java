/* Program to input Start and End limits and print all Fibonacci numbers between the ranges.(use for loop) */

import java.io.*;


class fibo
{
	int r1,r2,first,second,next;

	fibo()
	{
	first=0;
	second=1;
    next=0;
	}

	void getdata()
	{
	DataInputStream in=new DataInputStream(System.in);

	 try
	  {
	  System.out.print("Enter Start limit :");
	  r1=Integer.parseInt(in.readLine()); 
	  System.out.print("Enter End  limit  :");
	  r2=Integer.parseInt(in.readLine());
	  }
	 catch(Exception e)
		{ }
	}
       

	void calculate()
	{
	    
	 for(;next<=r2;)
	 {
	 if(next>=r1)
		System.out.println(next);

		first=second;
		second=next;
		next=first+second;
	  }
        }

	   	    
}


class fibonacci
{
	public static void main(String args[])
	 {
	  fibo obj=new fibo();
	  obj.getdata();
	  obj.calculate();
	 }
}


	

         



       



















				






















 