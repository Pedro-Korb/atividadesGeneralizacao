
public class AmbienteMain {

	public static void main(String[] args) {
		
		
		Ambiente amb = new Ambiente();
		Quarto qt = new Quarto();
		Sala sl = new Sala();
		Banheiro bn = new Banheiro();
		Cozinha cz = new Cozinha();
		
		amb.setArea(230);
		
		qt.setArea(30);
		qt.setCapacidade(2);
		
		sl.setArea(50);
		sl.setTv(true);
		
		bn.setArea(50);
		bn.setBanheira(false);
		
		cz.setArea(100);
		cz.setMicroondas(true);
		
		
		System.out.println(amb);
		System.out.println();
		
		System.out.println(qt);
		System.out.println();
		
		System.out.println(sl);
		System.out.println();
		
		System.out.println(bn);
		System.out.println();
		
		System.out.println(cz);

	}

}
