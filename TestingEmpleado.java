import java.util.ArrayList; import java.util.Arrays;
public class TestingEmpleado {
    public static void main (String args[]) {
        Empresa empresita=new Empresa("manolo");
        empresita.cargarDatos();
        
        System.out.println(empresita.buscarPorSexo('H'));
        System.out.println(empresita.buscarUno(103));
        System.out.println(empresita.buscarTodos());
        System.out.println(empresita.masaSalarial());
        System.out.println(empresita.buscarPorDepartamento(5));
        System.out.println(empresita.buscarPorPais("RUGBIN"));
    }
}
