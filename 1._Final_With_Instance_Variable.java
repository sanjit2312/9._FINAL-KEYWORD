package final_keyword;

public class Final_With_Instance_Variable 
{

	public static void main(String[] args)
	{
		
		Vivek obj=new Vivek();
		int a=10;
		int sum=a+obj.roll;
		
		System.out.println("Sum = "+sum);
		System.out.println("Roll = "+obj.roll);
        
	}

}

class Vivek
{
	final int roll;
	Vivek()
	{
		roll=101;
	}
}
