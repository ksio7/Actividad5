import java.util.ArrayList; import java.util.Arrays;
public class Empresa {
    //Atributos de instancia
	private String nombre; ArrayList<Empleado> plantilla;

    //Método constructor
	public Empresa(String nombre) {
		this.nombre = nombre;

	}

	public void cargarDatos() {
		Localidad localidad1=new Localidad(28001, "calle Serrano 28", "Madrid", "España");
		Localidad localidad2=new Localidad(516, "333 Oxford St", "Londres", "RUGBIN");
		Trabajo trabajo1=new Trabajo("i21", "contable", 25000, 40000);
		Departamento depto1=new Departamento(3, "finanzas", localidad1);
		Departamento depto2=new Departamento(5, "atcn. cliente", localidad1);
		Departamento depto3=new Departamento(13, "finanzas", localidad2);
		Empleado e1=new Empleado(101, "Andrés", "Bueno Cruz", 'H', "anbucr90@gmail.com", 25000, 5000, trabajo1, depto1);
		Empleado e2=new Empleado(102, "Blanca", "Bueno Cruz", 'M', "blbucr90@gmail.com", 26000, 5000, trabajo1, depto3);
		Empleado e3=new Empleado(103, "Carlos", "Cruz Dolera", 'H', "cacrdo90@gmail.com", 27000, 5000, trabajo1, depto1);
		Empleado e4=new Empleado(104, "Dorleta", "Cruz Dolera", 'M', "docrdo90@gmail.com", 28000, 5000, trabajo1, depto3);
		Empleado e5=new Empleado(105, "Elias", "Dolera Espada", 'H', "eldoes90@gmail.com", 29000, 5000, trabajo1, depto2);
	    plantilla=new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
	}
	
	//Métodos getter
	public String getNombre() {
		return nombre;
	}
    //Métodos setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	ArrayList<Empleado> listaporsexo=new ArrayList();
	public ArrayList<Empleado> buscarPorSexo(char sexo) {
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getSexo()==sexo)
		    	  listaporsexo.add(plantilla.get(i));
		}
		System.out.println("El número de empleados de sexo "+sexo+" es " +listaporsexo.size()+".");
		return listaporsexo;
	}
	
	Empleado empleadobuscado;
	public Empleado buscarUno(int idEmpleado) {
		int i=0;
		while (plantilla.get(i).getIdEmpleado()!=idEmpleado) {
			i=i+1;
			}
	    return empleadobuscado=plantilla.get(i);
	}

	public ArrayList<Empleado> buscarTodos() {
		return plantilla;
	}
	
	public double masaSalarial() {
		double salariototal=0;
		for (int i=0;i<plantilla.size();i++) {
			salariototal=salariototal+plantilla.get(i).getSalario();
		}
		return salariototal;
	}
	ArrayList<Empleado> listapordpto=new ArrayList();
	public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getIdDepartamento()==idDepar)
		    	  listapordpto.add(plantilla.get(i));
		}
		System.out.println("El número de empleados del dpto. "+idDepar+" es " +listapordpto.size()+".");
		return listapordpto;
	}
	ArrayList<Empleado> listaporpais=new ArrayList();
	public ArrayList<Empleado> buscarPorPais(String pais) {
		for (int i=0;i<plantilla.size();i++) {
		      if (plantilla.get(i).getPaisss()==pais)
		    	  listaporpais.add(plantilla.get(i));
		}
		System.out.println("El número de empleados del pais "+pais+" es " +listaporpais.size()+".");
		return listaporpais;
	}
	
	public boolean alta (boolean alta) {
    if (alta != null) return alta = true;
	
	}

public int buscarPorTrabajo (int idTrabajo) {
    System.out.println("introduzca el idTrabajo");
    Scanner sc1 = new Scanner(System.in);
    idTrabajo = sc1.nextInt();


    switch(idTrabajo) {

    case 1:
    if (idTrabajo == 1); 
    System.out.println("Programador");
        break;

    case 2:
        if (idTrabajo == 2); 
        System.out.println("Directivo");
            break;

    case 3:
        if (idTrabajo == 3); 
        System.out.println("Limpiador");
            break;

    case 4:
        if (idTrabajo == 4); 
        System.out.println("Seguridad");
        break;

        default:

}

	public String modificarUno() {

    System.out.println("elige el dato a modificar:");
    System.out.println("1: Salario ");
    System.out.println("2: Comisión");
    System.out.println("3: Ciudad ");
    System.out.println("4: País ");

    Scanner sc2 = new Scanner(System.in);
    int eleccion = sc2.nextInt();
    switch(eleccion) {

    case 1: 
        if (eleccion == 1);
        System.out.println("Introduzca el nuevo salario");
        empleado1.setsalario = Sc2.nextInt();
        break;

    case 2:
        if (eleccion == 2);
        System.out.println("Introduzca la nueva comisión");
        empleado1.setcomision = Sc2.nextInt();
        break;

    case 3:
        if (eleccion == 3);
        System.out.println("Introduzca la nueva ciudad");
        Scanner strn1 = new Scanner(System.in);
        empleado1.setciudad = strn1.next();
        break;

    case 4:
        if (eleccion == 4);
        System.out.println("Introduzca el nuevo país");
        empleado1.setpais = strn1.next();
        break;

        default:

    }

}
	public int eliminarUno() {

    System.out.println("Introduzca el id del trabajador a eliminar");

    Scanner sc3 = new Scanner(System.in);
    idEmpleado = sc3.nextInt();
    int empId = idEmpleado;

    switch(empId) {

    case 1:
        if (empId == 101);
        empleado1.setTrabajo = null;
        break;

    case 2:
        if (empId == 102);
        empleado2.setTrabajo = null;
        break;

    case 3:
        if (empId == 103);
        empleado3.setTrabajo = null;
        break;

    case 4:
        if (empId == 104);
        empleado4.setTrabajo = null;
        break;

    case 5:
        if (empId == 105);
        empleado5.setTrabajo = null;
        break;

        default:

    }

}	
		
		
		
	
}
