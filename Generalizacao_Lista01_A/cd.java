
public class cd extends midia{
	
	private String faixas;
	private String artista;
	private String album;
	
	
	public String getFaixas() {
		return faixas;
	}
	public void setFaixas(String faixas) {
		if (faixas.length() > 0)
			this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		if (artista.length() > 0)
			this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		if (album.length() > 0)
			this.album = album;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cd [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}