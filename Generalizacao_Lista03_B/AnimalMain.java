
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal an = new Animal();
		Mamifero mam = new Mamifero();
		Reptil rep = new Reptil();
		Cao cao = new Cao();
		Gato gat = new Gato();
		Tartaruga tar = new Tartaruga();
		Lagarto lag = new Lagarto();
		
		
		an.setTemPelo(true);
		an.setCor("preto");
		
		mam.setCor("preto");
		mam.setTemPelo(true);
		mam.setHabito("terrestre");
		mam.setRegiaoHabitat("Tropical");
		
		rep.setCor("cinza");
		rep.setTemPelo(false);
		rep.setEhAgressivo(true);
		rep.setViveOnde("terrestre");
		
		cao.setCor("Preto");
		cao.setTemPelo(true);
		cao.setHabito("terrestre");
		cao.setRegiaoHabitat("Tropical");
		cao.setPeso(10);
		cao.setRaca("Rottweiler");
		
		gat.setCor("branco");
		gat.setTemPelo(true);
		gat.setHabito("terrestre");
		gat.setRegiaoHabitat("subtropical");
		gat.setTemPelo(true);
		gat.setRaca("Siames");
		
		tar.setTemPelo(false);
		tar.setCor("verde");
		tar.setEhAgressivo(false);
		tar.setViveOnde("aquatico");
		tar.setAquatico(true);
		tar.setRaca("Marinha");
		
		lag.setCor("Verde");
		lag.setTemPelo(false);
		lag.setEhAgressivo(true);
		lag.setViveOnde("Terrestre");
		lag.setEhAgressivo(true);
		lag.setRaca("Teiu");
		
		
		
		System.out.println(an);
		System.out.println();
		
		System.out.println(mam);
		System.out.println();
		
		System.out.println(rep);
		System.out.println();
		
		System.out.println(cao);
		System.out.println();
		
		System.out.println(gat);
		System.out.println();
		
		System.out.println(tar);
		System.out.println();
		
		System.out.println(lag);
		
	}

}
