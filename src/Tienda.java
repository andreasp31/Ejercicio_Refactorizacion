public class Tienda {
    public String direccion;
    public String telefono;

    //Le paso los datos para que en la clase gestión pueda crearse nuevas tiendas
    public Tienda(String direccion,String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

