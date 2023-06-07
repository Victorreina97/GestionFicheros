import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate FechaNacimineto;
	private String curso;

	public Persona(String nombre, LocalDate fechaNacimineto, String curso) {
		super();
		this.nombre = nombre;
		FechaNacimineto = fechaNacimineto;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimineto() {
		return FechaNacimineto;
	}

	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		FechaNacimineto = fechaNacimineto;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", FechaNacimineto=" + FechaNacimineto + ", curso=" + curso + "]";
	}

}
