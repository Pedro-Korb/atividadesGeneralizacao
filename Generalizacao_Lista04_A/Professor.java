
public class Professor extends Pessoa {
	
	private String Disciplina;

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		if (Disciplina.length() > 0)
			Disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [Disciplina=");
		builder.append(Disciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
