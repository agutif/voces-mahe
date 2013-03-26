package youtube.kreizygames.vocesdelmahe;

public class Sonido {
	private String titulo;
	private int idSonido;
	private String comentario;
	
	public Sonido(String titulo, int idSonido, String comentario) {
		super();
		this.titulo = titulo;
		this.idSonido = idSonido;
		this.comentario = comentario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdSonido() {
		return idSonido;
	}
	public void setIdSonido(int idSonido) {
		this.idSonido = idSonido;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
