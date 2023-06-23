package com.gm.mundopc;
public class Monitor {
    private final int  idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor(){
        this.idMonitor = ++contadorMonitores;
    }
    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", tamaño=").append(tamaño);
        sb.append('}');
        return sb.toString();
    }
}
