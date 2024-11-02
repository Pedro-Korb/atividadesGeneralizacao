
public class Pessoa {

	private int Codigo;
	private String Nome;
	private String Endereco;


	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		if (Codigo > 0)
			Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0)
			Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			Endereco = endereco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Codigo=");
		builder.append(Codigo);
		builder.append(", Nome=");
		builder.append(Nome);
		builder.append(", Endereco=");
		builder.append(Endereco);
		builder.append("]");
		return builder.toString();
	}


}
