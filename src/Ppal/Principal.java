package Ppal;

import Concesionario.Concesionario;
import Vehiculo.Furgoneta;
import Vehiculo.VehiculoTurismo;

public class Principal {
    public static void main(String[] args) {
        VehiculoTurismo turismo1 = new VehiculoTurismo("Toyota", "Corolla", 10000, 5);
        VehiculoTurismo turismo2 = new VehiculoTurismo("Ford", "Focus", 10000, 7);

        Furgoneta furgoneta1 = new Furgoneta("Mercedes", "Sprinter", 20000, 8);

        Concesionario concesionario = new Concesionario();
        concesionario.agregarVehiculo(turismo1);
        concesionario.agregarVehiculo(turismo2);
        concesionario.agregarVehiculo(furgoneta1);

        concesionario.mostrarCatalogo();
        System.out.println("Precio total: " + concesionario.calcularPrecioTotal() + " euros");
    }
}
