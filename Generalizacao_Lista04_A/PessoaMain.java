
public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pes = new Pessoa();
		Aluno al = new Aluno();
		Professor pro = new Professor();
		
		pes.setCodigo(1);
		pes.setEndereco("Brasil");
		pes.setNome("Nome da pessoa");
		
		al.setCodigo(2);
		al.setNome("João");
		al.setMatricula(4334);
		al.setEndereco("Rio do Sul");
		
		pro.setCodigo(3);
		pro.setNome("Marcos");
		pro.setEndereco("Agronômica");
		pro.setDisciplina("Matemática");
		
		System.out.println(pes);
		System.out.println();
		
		System.out.println(al);
		System.out.println();
		
		System.out.println(pro);
		System.out.println();

	}

}
