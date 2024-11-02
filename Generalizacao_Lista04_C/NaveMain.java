
public class NaveMain {
	
	public static void main(String[] args)
	{
		
		NaveEspacial nave = new NaveEspacial();
		Apollo11 apo = new Apollo11();
		MilenniumFalcon mf = new MilenniumFalcon();
		
		nave.setVelocidadeMaxima(350);
		
		apo.setVelocidadeMaxima(300);
		apo.setTipoCombustivel("Etanol");
		
		mf.setVelocidadeMaxima(320);
		mf.setTipoCombustivel("Etanol");
		mf.setClasseHiperpropulsor(21);
		
		System.out.println(nave);
		System.out.println();
		
		System.out.println(apo);
		System.out.println();
		
		System.out.println(mf);
		System.out.println();
		
		
	}

}
