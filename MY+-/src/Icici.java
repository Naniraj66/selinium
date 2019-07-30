
public class Icici  implements Rbi
{
	public static void main (String [] args )
	{
		Icici i= new Icici ();
		i.withdrawal();
		i.deposit();
		}
	public void withdrawal() {
		System.out.println(" iam with drawal methods from child class");
	}
	public void deposit ()
	{
		System.out.println(" iam with deposit methods from child class");
	}
}
