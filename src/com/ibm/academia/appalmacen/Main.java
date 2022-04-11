package com.ibm.academia.appalmacen;
import com.ibm.academia.appalmacen.modelo.*;

public class Main {

    public static void main(String[] args) {

        Producto [] arregloProductos = new Producto[8];

       Fruta manzana = new Fruta("Manzana",5.0,0.300,"Rojo");
        Fruta pera = new Fruta("Pera",7.0,0.400,"Verde");

        Lacteo leche = new Lacteo("Leche Lala",20.0,40,100);
        Lacteo queso = new Lacteo("Queso oaxaca",30.0,40,50);

        Limpieza cloro = new Limpieza("Cloralex",20.0,"cloro",5);
        Limpieza gel = new Limpieza("Gel antibacterial",80.0,"Alcohol",2);

        NoPerecible atun = new NoPerecible("Atun",35.0,20,50);
        NoPerecible harina = new NoPerecible("Harina",35.0,100,25);

        arregloProductos[0]=manzana;
        arregloProductos[1]=pera;
        arregloProductos[2]=leche;
        arregloProductos[3]=queso;
        arregloProductos[4]=cloro;
        arregloProductos[5]=gel;
        arregloProductos[6]=atun;
        arregloProductos[7]=harina;

        int longitudArregloProductos = arregloProductos.length;

        for(int i = 0 ; i<longitudArregloProductos;i++){

            System.out.println(arregloProductos[i].toString());

        }







    }
}
