/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupointegrado.model;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Gabriel Capato
 */
public class Anuncio {
    
    private int id;
    private Blob IMG;
    private String Nome;
    private char tipoCombustivel;
    private double KM;
    private Date anoFabric;
    private Date anoModelo;
    private String Descricao;

    public Anuncio() {
    }

    public Anuncio(int id, Blob IMG, String Nome, char tipoCombustivel, double KM, Date anoFabric, Date anoModelo, String Descricao) {
        this.id                 = id;
        this.IMG                = IMG;
        this.Nome               = Nome;
        this.tipoCombustivel    = tipoCombustivel;
        this.KM                 = KM;
        this.anoFabric          = anoFabric;
        this.anoModelo          = anoModelo;
        this.Descricao          = Descricao;
    }

    public int getId() {
        return id;
    }

    public Blob getIMG() {
        return IMG;
    }

    public String getNome() {
        return Nome;
    }

    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getKM() {
        return KM;
    }

    public Date getAnoFabric() {
        return anoFabric;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public String getDescricao() {
        return Descricao;
    }

}
