public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public String sku;

    //Le paso los datos para que en la clase gestión pueda crearse nuevos productos
    public Producto(String nombre,double precio,int cantidad,String sku) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getSku() {
        return sku;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

}

