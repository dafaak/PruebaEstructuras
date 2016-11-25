package est.com;

public class Profesor extends Persona {
private Materia materia;
	

	public Profesor() {
		super.setNombre("");
	materia=new Materia();
	// TODO Auto-generated constructor stub
}


public Profesor(String nombre,Materia m) {
	super(nombre);
	this.materia=m;
	// TODO Auto-generated constructor stub
}



	/**
 * @return the materia
 */
public Materia getMateria() {
	return materia;
}


/**
 * @param materia the materia to set
 */
public void setMateria(Materia materia) {
	this.materia = materia;
}


	public String toString(){
		return super.toString()+"Materia: "+this.materia;
	}
	

	
	
}
