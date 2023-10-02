package vehiculos;

import java.util.HashMap;
import java.util.List;

import vehiculos.Vehiculo;
import java.util.Map;

public class Pais {

	private String nombre;
	private List<Vehiculo> vehiculos;

    public Pais(String nombre, List<test.vehiculos.Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
