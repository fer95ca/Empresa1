import java.util.LinkedList;

public class Empresa {

    private String NombreEmpresa;
    Empleado Em1 = new Empleado(" ", 0, 0, 0);

    Empresa(String nombre) {
        this.NombreEmpresa = nombre;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public static void Contratar(LinkedList<Empleado> Em1) {
        for (Empleado elemento : Em1)
            System.out.println(elemento.getNombre() + " " + elemento.getEdad() + " " + elemento.getID() + " "
                    + elemento.getSueldo_bruto());
    }

}
