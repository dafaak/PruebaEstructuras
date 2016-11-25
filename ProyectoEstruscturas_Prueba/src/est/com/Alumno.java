package est.com;

public class Alumno extends Persona {
	private Materia materia;

	public Alumno() {
		super();
		materia=new Materia();
		
		}

	public Alumno(String nombre,Materia m) {
		super(nombre);
		this.materia=m;
		// TODO Auto-generated constructor stub
	}

	
	public Materia getMateria() {
		return this.materia;
	}

	
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}
