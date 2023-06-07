import java.util.ArrayList;

public class Grupo {

	private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public Grupo() {
		super();
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	@Override
	public String toString() {
		return "Grupo [listaPersonas=" + listaPersonas + "]";
	}

}
