package com.gm.mundopc;

public class DispositivoEntrada {
    protected String tipoEntrada;
    protected String marca;

    public DispositivoEntrada(){
    }
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DispositivoEntrada{");
        sb.append("tipoEntrada='").append(tipoEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        //sb.append(", ").append(super.toString()); //para conocer su direccion
        sb.append('}');
        return sb.toString();
    }
}
