package final_keyword;

public class Final_Class 
{

	public static void main(String[] args)
	{
		
		Rahul m=new Rahul();
		Deepak b=new Deepak();
		
		m.disp();
		b.add();

	}

}

final class Rahul
{
	int a=100;
	void disp()
	{
		System.out.println("Super class Mother \n");
	}
}
class Deepak extends Rahul                 // Final class we cannot inherit.
{
	int b=200;
	public void add()
	{
		int sum=a+b;
		System.out.println("Sum= "+sum);
	}
}