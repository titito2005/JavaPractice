package Practica.Tienda;

public class ProductModel {
    private int precio;
    private String nombre;
    private int id;

    public ProductModel(int id, int precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getId(){
        return this.id;
    }
}
