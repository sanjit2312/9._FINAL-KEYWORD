package final_keyword;

public class Final_With_Local_Variable
{

	public static void main(String[] args) 
	{
		
		Sanjeet obj=new Sanjeet();
		obj.disp();

	}

}

class Sanjeet
{
	void disp()
	{
	    final int roll=101;
	    final int mark;
	     mark=365;
	   System.out.println("Roll = "+roll);
       System.out.println("Marks = "+mark);
	}

}