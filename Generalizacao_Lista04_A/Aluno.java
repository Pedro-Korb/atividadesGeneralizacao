
public class Aluno extends Pessoa{
	
	private int Matricula;

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		if (matricula > 0)
			Matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [Matricula=");
		builder.append(Matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
