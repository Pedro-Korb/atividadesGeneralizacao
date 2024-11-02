
public class itemMain {

	public static void main(String[] args) {
		
		cd cd1 = new cd();
		vhs vhs1 = new vhs();
		midia midia1 = new midia();
		livro livro1 = new livro();
		item item1 = new item();
		
		
		cd1.setAlbum("Ride the Lightning");
		cd1.setArtista("Metallica");
		cd1.setFaixas("Oito faixas");
		cd1.setDuracao(48);
		cd1.setGravadora("Sweet Silence Studios ");
		cd1.setCodigo(1);
		cd1.setDescricao("Músicas de Thrash Metal de 1984");
		
		vhs1.setTitulo("Músicas Caipiras - Compilado");
		vhs1.setGravadora("Música Caipira Brasileira");
		vhs1.setDuracao(50);
		vhs1.setDescricao("Música caipira dos anos 60");
		vhs1.setCodigo(2);
		
		midia1.setGravadora("Tipo de item que armazena conteúdo musical ");
		midia1.setDuracao(50);
		midia1.setDescricao("Gravadora de cs's e vhs's até 50 minutos");
		midia1.setCodigo(3);
		
		livro1.setAutor("Jimmy Page");
		livro1.setDescricao("Livro de sua trajetória na guitarra");
		livro1.setCodigo(4);
		
		item1.setDescricao("Muitas coisas são consideradas um item");
		item1.setCodigo(5);

		
		System.out.println(cd1);
		System.out.println();
		
		System.out.println(vhs1);
		System.out.println();
		
		System.out.println(midia1);
		System.out.println();
		
		System.out.println(livro1);
		System.out.println();
		
		System.out.println(item1);

	}

}