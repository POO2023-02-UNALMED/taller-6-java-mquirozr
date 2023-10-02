package vehiculos;

import vehiculos.Vehiculo;

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(String placa, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(placa, 4, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}