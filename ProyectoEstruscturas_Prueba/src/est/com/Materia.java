package est.com;

public class Materia {
	private String nombre;

	public Materia() {
		this.nombre="";
		
	}

	public Materia(String nombre) {
		this.nombre = nombre;
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "]";
	}
	

}
