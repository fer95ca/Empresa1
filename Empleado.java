public class Empleado extends Persona {

    private float sueldo_bruto;

    public Empleado(String Nombre, int Edad, long ID, float sueldo_bruto) {
        super(Nombre, Edad, ID);
        this.sueldo_bruto = sueldo_bruto;
    }

    public float getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(float sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

}