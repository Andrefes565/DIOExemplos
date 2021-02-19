package com.adnre.POO.exemploThisESuper;

import com.adnre.POO.exemploThisESuper.Veiculo;

public class Moto extends Veiculo {

    private String marca;
    private String modelo;
    private Double valorVenal;
    private  Integer cilindradas;

    public Moto(String marca, String modelo, Double valorVenal, Integer cilindradas) {
        super(marca, modelo, valorVenal);
        this.cilindradas = cilindradas;
    }

    public Double calcularValorVenal() {
        return this.getValorVenal() * 0.07;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
}
