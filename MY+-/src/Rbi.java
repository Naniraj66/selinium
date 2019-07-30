
public interface Rbi
{
	public abstract void withdrawal ();
	public abstract void deposit ( );
	public static void main (String [] args)
	{
		Rbi r =new Icici ();
		r.deposit();
		Rbi r1 =new Hdfc ();
		r1.withdrawal();
		Rbi s;
		s= new Icici ();
		s.deposit();
		s=new Hdfc();
		s.withdrawal();
	}
	
}
