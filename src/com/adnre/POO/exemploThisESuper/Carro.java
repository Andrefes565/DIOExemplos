package com.adnre.POO.exemploThisESuper;

public class Carro extends Veiculo {

    private String marca;
    private String modelo;
    private Double valorVenal;
    private Integer qtdPortas;

    public Carro(String marca, String modelo, Double valorVenal, Integer qtdPortas) {
        super(marca, modelo, valorVenal);
        this.qtdPortas = qtdPortas;
    }

    public Double calcularValorVenal() {
        return this.getValorVenal() * 0.05;
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

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}

