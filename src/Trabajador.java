public class Trabajador {
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public Tienda tienda;

    //Le paso los datos para que en la clase gestión pueda crearse nuevos trabajadores
    public Trabajador(String nombre,String apellido,String direccion,Tienda tienda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tienda = tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion + "\nTelefono: " + telefono;
    }
}

