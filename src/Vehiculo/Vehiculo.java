package Vehiculo;
public abstract class Vehiculo {
    public String marca;
    public String modelo;
    public double precioBase;
    
public Vehiculo(String marca, String modelo, double precioBase) {
    this.marca = marca;
    this.modelo = modelo;
    this.precioBase = precioBase;
    }
    
public abstract double calcularPrecioFinal();
}
