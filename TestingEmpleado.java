import java.util.ArrayList; import java.util.Arrays;
public class TestingEmpleado {
    public static void main (String args[]) {
        Empresa empresita=new Empresa("manolo");
        empresita.cargarDatos();
        
        //Creacion objeto empleado
        Empleado empleado1 = new Empleado();
        
        empleado1.setApellido1("Felipe");
        empleado1.setApellido2("Guzman");       
        empleado1.setComision("20");
        empleado1.setDireccion("Calle Maestra 9");        
        empleado1.setEmail("juanjuanitojuan@gmail.com");
        empleado1.setGenero("M");
        empleado1.setIdDepar("2");
        empleado1.setIdEmpleado("23242");
        empleado1.setIdLocalidad("34");
        empleado1.setNombre("Juan");
        empleado1.setSalario("123412");
        empleado1.setNombreDepartamento("Programacion");
        empleado1.setPais("Brasil");
        empleado1.setCiudad("Huelva");
        empleado1.setTrabajo("Programador");

        // Creacion objeto departamento
        Localidad localidad1 = new Localidad();
        
        localidad1.setCiudad("Martos");
        localidad1.setDireccion("C/ Bilbao 9");
        localidad1.setIdLocalidad("2");
        
        //Creacion del objeto trabajo
        Trabajo trabajo1 = new Trabajo();
        
        trabajo1.setdescripcion("Programador");
        trabajo1.setIdTrabajo(10);
        trabajo1.setMaxSalario(300000);
        trabajo1.setMinSalario(10000);
        
        //Comprobacion variables

        System.out.println(empleado1);
        System.out.println(departamento1);
        System.out.println(localidad1);
        
        
        //Comprobacion sin usar el metodo toString
        
        System.out.println(empleado1.getNombre() + " " + empleado1.getApellido1() + " " + empleado1.getApellido2() + " " + empleado1.getGenero() + " " + empleado1.getDepartamento() + " " + empleado1.getDireccion() + " " + empleado1.getTrabajo() + " " + empleado1.getCiudad() + " " + empleado1.getPais());

        // Variables para extraer el trabajo y el departamento
        
        System.out.println(empleado1.TrabajoYDept(empleado1.getNombreDepartamento(),empleado1.getTrabajo()));
        
       
        
        







        
        
        System.out.println(empresita.buscarPorSexo('H'));
        System.out.println(empresita.buscarUno(103));
        System.out.println(empresita.buscarTodos());
        System.out.println(empresita.masaSalarial());
        System.out.println(empresita.buscarPorDepartamento(5));
        System.out.println(empresita.buscarPorPais("RUGBIN"));
    }
}
