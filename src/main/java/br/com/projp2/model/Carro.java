package br.com.projp2.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document
public class Carro implements Serializable {

    @Id
    private  int id;
    private int ano;
    private int qtd_portas;
    private String modelo;
    private String cor;
    private Motor motor;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }
}
