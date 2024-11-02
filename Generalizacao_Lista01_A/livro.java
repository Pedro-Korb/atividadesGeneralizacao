
public class livro extends item{
	
	private String autor;

	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length() > 0)
			this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}