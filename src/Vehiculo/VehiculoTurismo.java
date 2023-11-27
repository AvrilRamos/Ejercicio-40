package Vehiculo;
public class VehiculoTurismo extends Vehiculo {
    int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        super(marca, modelo, precioBase);
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return precioBase;
        } else {
            int excesoPlazas = numeroPlazas - 5;
            double aumentoPrecio = 0.10 * excesoPlazas * precioBase;
            return precioBase + aumentoPrecio;
        }
    }
}