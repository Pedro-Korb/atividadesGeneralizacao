
public class BombaMain {

	public static void main(String[] args) {
		
		
		Bomba b = new Bomba();
		BombaGasolina bg = new BombaGasolina();
		BombaEtanol be = new BombaEtanol();
		BombaDiesel bd = new BombaDiesel();
		
		b.setTotalListros(1500);
		b.setValorLitro(5);
		
		bg.setTotalListros(500);
		bg.setValorLitro(6);
		
		bd.setTotalListros(500);
		bd.setValorLitro(7);
		
		be.setTotalListros(500);
		be.setValorLitro(4);
		
		bg.abastecerPorLitro(50);
		bd.abastecerPorLitro(100);
		be.abastecerPorLitro(150);
		
		bg.abastecerPorValor(200);
		bd.abastecerPorValor(200);
		be.abastecerPorValor(200);
		
		System.out.println(b);
		System.out.println(bg);
		System.out.println(bd);
		System.out.println(be);
		

	}

}
