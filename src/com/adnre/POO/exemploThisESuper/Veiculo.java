package com.adnre.POO.exemploThisESuper;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private Double valorVenal;

    public Veiculo(String marca, String modelo, Double valorVenal) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;
    }


    public abstract Double calcularValorVenal();


    public abstract String getMarca();

    public abstract void setMarca(String marca);

    public abstract String getModelo();

    public abstract void setModelo(String modelo);

    public abstract Double getValorVenal();

    public abstract void setValorVenal(Double valorVenal);

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valorVenal=" + valorVenal +
                '}';
    }
}

