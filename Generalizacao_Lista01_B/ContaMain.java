
public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaEspecial ce = new ContaEspecial();
		ContaSimples cs = new ContaSimples();
		Conta ct = new Conta();
		
		ce.setBanco("Bradesco");
		ce.setAgencia(143);
		ce.setNumeroconta(42342);
		ce.setSaldo(10000);
		ce.setDiasSemJuros(30);
		ce.setLimite(2000);
		
		cs.setBanco("Banco do Brasil");
		cs.setAgencia(342);
		cs.setNumeroconta(65443452);
		cs.setSaldo(50000);
		cs.setSaldoPoupanca(15000);
		
		ct.setBanco("Itaú");
		ct.setAgencia(999);
		ct.setNumeroconta(999999);
		ct.setSaldo(1000000);
		
		cs.saquePoupanca(5000);
		cs.depositoPoupanca(1000);
		
		System.out.println();
		System.out.println(ce);
		
		System.out.println();
		System.out.println(cs);
		
		System.out.println();
		System.out.println(ct);

	}

}
