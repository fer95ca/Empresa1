
import java.util.LinkedList;

public class main {
    public static void main(String args[]) {

        Empleado Eempleado = new Empleado("Jose", 35, 20000, 15000);
        Empleado E4 = new Empleado("Claudeth", 21, 221054684, 14000);

        LinkedList<Empleado> empleados = new LinkedList<Empleado>();
        empleados.add(Eempleado);
        empleados.add(E4);

        Empresa empresa_Manda = new Empresa("Manda");
        System.out.println(empresa_Manda.getNombreEmpresa());
        Empresa.Contratar(empleados);
    }
}
