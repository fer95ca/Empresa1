public class Persona {
    private String Nombre;
    private int Edad;
    private long ID;

    public Persona(String nombre, int edad, long id) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.ID = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public long getID() {
        return ID;
    }

    public void setID(long id) {
        ID = id;
    }
}