package final_keyword;

public class Final_Method 
{

	public static void main(String[] args) 
	{
		
		Muna f=new Muna();
		Beta b=new Beta();
		Daughter d=new Daughter();
		
		f.disp();
		b.disp();
		d.disp();

	}

}

class Muna
{
	int a=100;
	final void disp()
	{
		System.out.println("Super class Muna\n");
	}
}
class Beta extends Muna
{
	int b=200;
	void disp()                                                       // we cannot override final method.
	{
		System.out.println("Sub class Beta");
		System.out.println("Add="+(a+b));
	}
}
class Daughter extends Muna
{
	int c=300;
    void disp()
	{
		System.out.println("Sub class Daughter");
		System.out.println("Multiplication="+(a*c));
	}
}