
public class HeroHonda extends Bike  {

	@Override
	public void Enginee() {
		System.out.println("Bikes have enginee");
	}
		
	
	
	public void Wheels() {
	System.out.println("Bikes have wheels");
	
	}
		public static void main(String [] args)
		{
		//Create object 
		HeroHonda objHH= new HeroHonda ();
		objHH.Enginee();
		objHH.seat();
		objHH.Wheels();
		objHH.handle();
		
	}


}
	
