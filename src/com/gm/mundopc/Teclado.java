package com.gm.mundopc;
import com.gm.mundopc.DispositivoEntrada;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    private Teclado(){
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public Teclado(String tipoEntrada, String marca){
        this(); //De esta forma llamo al constructor vacio el cual tiene el id
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString()).append('}');
        return sb.toString();
    }
}
