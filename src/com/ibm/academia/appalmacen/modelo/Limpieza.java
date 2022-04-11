package com.ibm.academia.appalmacen.modelo;

public class Limpieza extends Producto{
    private String componentes;
    private double litros;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }


    @Override
    public String toString() {
        return super.toString() + " Componentes: " + this.getComponentes() +
                " Litros: " + this.getLitros();

    }
}
