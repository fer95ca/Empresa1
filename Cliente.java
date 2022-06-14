public class Cliente extends Persona {

    private String telefono_contacto;

    public Cliente(String Nombre, int Edad, long ID, String telefono_contacto) {
        super(Nombre, Edad, ID);
        this.telefono_contacto = telefono_contacto;
    }

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

}
