package Concesionario;

import java.util.ArrayList;
import java.util.List;

import Vehiculo.Vehiculo;

public class Concesionario {
    List<Vehiculo> catalogo;

    public Concesionario() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }

    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println(vehiculo.marca + " " + vehiculo.modelo + " - Precio: " + vehiculo.calcularPrecioFinal() + " euros");
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vehiculo vehiculo : catalogo) {
            total += vehiculo.calcularPrecioFinal();
        }
        return total;
    }
}