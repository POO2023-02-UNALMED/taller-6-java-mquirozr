package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private Map<Fabricante, Integer> ventasPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void registrarVenta() {
        ventasPorFabricante.put(this, ventasPorFabricante.getOrDefault(this, 0) + 1);
    }

    public static Fabricante fabricaMayorVentas() {
        int maxVentas = 0;
        Fabricante fabricanteMasVendedor = null;

        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                fabricanteMasVendedor = entry.getKey();
            }
        }

        return fabricanteMasVendedor;
    }
}

/*package vehiculos;

import vehiculos.Pais;

public class Fabricante {
	
	private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}
*/