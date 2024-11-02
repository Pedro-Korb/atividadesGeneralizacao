
public class XadrezMain {

	public static void main(String[] args) {
		
		Peao peao_branco1 = new Peao();
		Peao peao_branco2 = new Peao();
		Peao peao_branco3 = new Peao();
		Peao peao_branco4 = new Peao();
		Peao peao_branco5 = new Peao();
		Peao peao_branco6 = new Peao();
		Peao peao_branco7 = new Peao();
		Peao peao_branco8 = new Peao();
		
		Torre torre_branco1 = new Torre();
		Torre torre_branco2 = new Torre();
		
		Bispo bispo_branco1 = new Bispo();
		Bispo bispo_branco2 = new Bispo();
		
		Cavalo cavalo_branco1 = new Cavalo();
		Cavalo cavalo_branco2 = new Cavalo();
		
		Rainha rainha_branco = new Rainha();
		Rei rei_branco = new Rei();
		
		
		
		
		Peao peao_preto1 = new Peao();
		Peao peao_preto2 = new Peao();
		Peao peao_preto3 = new Peao();
		Peao peao_preto4 = new Peao();
		Peao peao_preto5 = new Peao();
		Peao peao_preto6 = new Peao();
		Peao peao_preto7 = new Peao();
		Peao peao_preto8 = new Peao();
		
		Torre torre_preto1 = new Torre();
		Torre torre_preto2 = new Torre();
		
		Bispo bispo_preto1 = new Bispo();
		Bispo bispo_preto2 = new Bispo();
		
		Cavalo cavalo_preto1 = new Cavalo();
		Cavalo cavalo_preto2 = new Cavalo();
		
		Rainha rainha_preto = new Rainha();
		Rei rei_preto = new Rei();
			
		
		peao_branco1.setLinha(2);
		peao_branco1.setColuna(1);
		peao_branco1.setCor(true);
		
		peao_branco2.setLinha(2);
		peao_branco2.setColuna(2);
		peao_branco2.setCor(true);
		
		peao_branco3.setLinha(2);
		peao_branco3.setColuna(3);
		peao_branco3.setCor(true);
		
		peao_branco4.setLinha(2);
		peao_branco4.setColuna(4);
		peao_branco4.setCor(true);
		
		peao_branco5.setLinha(2);
		peao_branco5.setColuna(5);
		peao_branco5.setCor(true);
		
		peao_branco6.setLinha(2);
		peao_branco6.setColuna(6);
		peao_branco6.setCor(true);
		
		peao_branco7.setLinha(2);
		peao_branco7.setColuna(7);
		peao_branco7.setCor(true);
		
		peao_branco8.setLinha(2);
		peao_branco8.setColuna(8);
		peao_branco8.setCor(true);
		
		torre_branco1.setLinha(1);
		torre_branco1.setColuna(1);
		torre_branco1.setCor(true);
		
		torre_branco2.setLinha(1);
		torre_branco2.setColuna(8);
		torre_branco2.setCor(true);
		
		bispo_branco1.setLinha(1);
		bispo_branco1.setColuna(3);
		bispo_branco1.setCor(true);
		
		bispo_branco2.setLinha(1);
		bispo_branco2.setColuna(6);
		bispo_branco2.setCor(true);
		
		cavalo_branco1.setLinha(1);
		cavalo_branco1.setColuna(2);
		cavalo_branco1.setCor(true);
		
		cavalo_branco2.setLinha(1);
		cavalo_branco2.setColuna(7);
		cavalo_branco2.setCor(true);
		
		rainha_branco.setLinha(1);
		rainha_branco.setColuna(4);
		rainha_branco.setCor(true);
		
		rei_branco.setLinha(1);
		rei_branco.setColuna(5);
		rei_branco.setCor(true);
		
		
		peao_preto1.setLinha(7);
		peao_preto1.setColuna(1);
		peao_preto1.setCor(false);
		
		peao_preto2.setLinha(7);
		peao_preto2.setColuna(2);
		peao_preto2.setCor(false);
		
		peao_preto3.setLinha(7);
		peao_preto3.setColuna(3);
		peao_preto3.setCor(false);
		
		peao_preto4.setLinha(7);
		peao_preto4.setColuna(4);
		peao_preto4.setCor(false);
		
		peao_preto5.setLinha(7);
		peao_preto5.setColuna(5);
		peao_preto5.setCor(false);
		
		peao_preto6.setLinha(7);
		peao_preto6.setColuna(6);
		peao_preto6.setCor(false);
		
		peao_preto7.setLinha(7);
		peao_preto7.setColuna(7);
		peao_preto7.setCor(false);
		
		peao_preto8.setLinha(7);
		peao_preto8.setColuna(8);
		peao_preto8.setCor(false);
		
		torre_preto1.setLinha(8);
		torre_preto1.setColuna(1);
		torre_preto1.setCor(false);
		
		torre_preto2.setLinha(8);
		torre_preto2.setColuna(8);
		torre_preto2.setCor(false);
		
		bispo_preto1.setLinha(8);
		bispo_preto1.setColuna(3);
		bispo_preto1.setCor(false);
		
		bispo_preto2.setLinha(8);
		bispo_preto2.setColuna(6);
		bispo_preto2.setCor(false);
		
		cavalo_preto1.setLinha(8);
		cavalo_preto1.setColuna(2);
		cavalo_preto1.setCor(false);
		
		cavalo_preto2.setLinha(8);
		cavalo_preto2.setColuna(7);
		cavalo_preto2.setCor(false);
		
		rainha_preto.setLinha(8);
		rainha_preto.setColuna(4);
		rainha_preto.setCor(false);
		
		rei_preto.setLinha(8);
		rei_preto.setColuna(5);
		rei_preto.setCor(false);
		
		

		System.out.println(peao_branco1);
		System.out.println(peao_branco2);
		System.out.println(peao_branco3);
		System.out.println(peao_branco4);
		System.out.println(peao_branco5);
		System.out.println(peao_branco6);
		System.out.println(peao_branco7);
		System.out.println(peao_branco8);
		
		System.out.println(torre_branco1);
		System.out.println(torre_branco2);
		
		System.out.println(bispo_branco1);
		System.out.println(bispo_branco2);
		
		System.out.println(cavalo_branco1);
		System.out.println(cavalo_branco2);
		
		System.out.println(rainha_branco);
		System.out.println(rei_branco);
		
		System.out.println();
		System.out.println();
		
		System.out.println(peao_preto1);
		System.out.println(peao_preto2);
		System.out.println(peao_preto3);
		System.out.println(peao_preto4);
		System.out.println(peao_preto5);
		System.out.println(peao_preto6);
		System.out.println(peao_preto7);
		System.out.println(peao_preto8);
		
		System.out.println(torre_preto1);
		System.out.println(torre_preto2);
		
		System.out.println(bispo_preto1);
		System.out.println(bispo_preto2);
		
		System.out.println(cavalo_preto1);
		System.out.println(cavalo_preto2);
		
		System.out.println(rainha_preto);
		System.out.println(rei_preto);
	
	}

}