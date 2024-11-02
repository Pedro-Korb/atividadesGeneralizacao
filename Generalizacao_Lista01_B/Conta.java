
public class Conta {

	private String Banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	public String getBanco() {
		return Banco;
	}
	public void setBanco(String banco) {
		if (banco.length() > 0)
		 Banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia > 0)
			this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		if (numeroconta > 0)
			this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo > 0)
			this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [Banco=");
		builder.append(Banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

}
