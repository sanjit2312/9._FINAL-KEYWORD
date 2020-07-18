package final_keyword;

public class Final_With_Static_Variable 
{

	public static void main(String[] args)
	{

         SanjitSingh obj=new SanjitSingh();
         System.out.println("Roll = "+obj.roll);
         System.out.println("Marks = "+obj.mark);
        

	}
	

}

class SanjitSingh
{
	static final int roll=101;
	static final int mark;
	static
	{
		mark=340;
	}
	
}
