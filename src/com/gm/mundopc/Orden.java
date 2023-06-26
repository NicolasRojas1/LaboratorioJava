package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    private Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < MAX_COMPUTADORAS){
            //Primero asigno el valor y posteriormente se va a incrementar esta variable "contadorComputadoras"
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else {
            System.out.println("Se ha superado el maximo de ventas de computadoras por persona " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Id de la orden: " + this.idOrden);
        System.out.println("Los productos ordenados son: ");
        //utilizo este this como limite para que me muestre las cantidades que en realidad hay y no iteres espacios vacios del arreglo
        for (int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }

}
