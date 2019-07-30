
public class Variablesexample {
	//variable is class/static Variable
	static int a=100;
	//My salary variable is local variable
	public int Salary ( )
	{
		int mysalary=10000+2000+1500;
		mysalary=mysalary +a ;
		
		return mysalary;
	}
	public static void main (String []args )
	
	{
		//Instance variable
		int b=200;
		System.out.println(a);//100
		System.out.println(a);//200
		Variablesexample obj=new Variablesexample();
		System.out.println(obj.Salary());
		//i is a local Variable
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			System.out.println(a);
			System.out.println(b);
			
			
		}
	
	}
		
	}
	


