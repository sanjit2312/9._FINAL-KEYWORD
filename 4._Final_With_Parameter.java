package final_keyword;

public class Final_With_Parameter
{

	public static void main(String[] args)
	{
		
		Sanjeetk obj=new Sanjeetk();
		obj.disp(60);

	}

}

class Sanjeetk
{
	void disp(final int x)
	{
       System.out.println("X = "+x);
	}

}