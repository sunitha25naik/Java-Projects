/* B.3 Program to calculate marks of a student using multiple inheritance implemented through interface. 
Class Student with data members rollNo, name, String cls and methods to set and put data.
 Create another class test extended by class Student with data members mark1, mark2, mark3 and
 methods to set and put data. Create interface sports with members sportsWt = 5 and putWt(). 
Now let the class results extends class test and implements interface sports. 
Write a Java program to read required data and display details in a neat format. */

class student
{
	int rollno;
	void getnumber(int n)
	{
	rollno=n;
	}
	void putnumber()
	{
	System.out.println("Roll No:" + rollno);
	}
}

class test extends student
{
	float mark1,mark2,mark3;
	void getmarks(float m1, float m2, float m3)
	{
	mark1=m1;
	mark2=m2;
	mark3=m3;
	}

	void putmarks()
	{
	System.out.println("Marks Obtained");
	System.out.println("Mark 1="+mark1);
	System.out.println("Mark 2="+mark2);
	System.out.println("Mark 3="+mark3);

	}
}


interface sports
{
	float sportwt=5.0f;
	void putwt();
}

class result extends test implements sports
{
	float total;
	public void putwt()
	{
	System.out.println("Sports wt="+sportwt);
	}

	void display()
	{
	total=mark1+mark2+mark3+sportwt;
	putnumber();
	putmarks();
	putwt();
	System.out.println("Total score="+total);
	}
}

class hybrid
{
	public static void main(String args[])
	{
	result obj=new result();
	obj.getnumber(123);
	obj.getmarks(27.5f, 33.0f,25.0f);
	obj.display();
	}
}


	