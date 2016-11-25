package est.com;

import java.nio.channels.spi.AbstractSelectableChannel;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Materia fisica=new Materia("fisica");
		Materia quimica=new Materia("quimica");
		Materia matematica=new Materia("matematica");
		Materia m[]={fisica,quimica,matematica};
		Profesor p[]=new Profesor[4];
		
		p[0]=new Profesor("pablo",fisica);
		p[1]=new Profesor("fabricio",quimica);
		p[2]=new Profesor("anderson",matematica);
		
		Alumno a[]= new Alumno[5];
		a[0]=new Alumno("israel",fisica);
		a[1]=new Alumno("fausto",quimica);
		a[2]=new Alumno("javier",matematica);
		a[3]=new Alumno("mateo",quimica);
		a[4]=new Alumno("miguel",matematica);
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del profesor que desa buscar:"));
		
		System.out.println(buscarPam(n,p,a));
		
		int n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del alumno que desa buscar:"));
		System.out.println(buscarAm(n1,m,a));
		
		
		
		
		
	}
	 static String buscarPam(int p, Profesor []prof,Alumno []a){
		String res="";
		Materia aux=new Materia();
		Materia aux1= new Materia();
		for(int i=0;i<prof.length;i++){
			if(p==i){
				res+="Profesor: "+prof[i].getNombre();
				
				aux=prof[i].getMateria();
				for(int j=0;j<a.length;j++){
					
					aux1=a[j].getMateria();
					if(aux.getNombre().equals(aux1.getNombre())){
						res+="\n Alumno: "+a[j].getNombre();
					}
				}
				
				
			}
			
		}res+= "\n"+aux;
				return res;
	}

	 
	 static String buscarAm(int p,Materia []m,Alumno []a){
			String res="";
			
				res+="Alumno:"+a[p].getNombre()+" materia: "+a[p].getMateria().getNombre();
					
				
				
			
					return res;
		}
	 
}
