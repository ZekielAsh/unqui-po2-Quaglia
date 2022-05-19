package ar.edu.unq.po2.streams;

public class Persona {
	private String nombre;
	private int edad;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean empiezaCon(String inicio) {
		return this.getNombre().startsWith(inicio);
	}
}
