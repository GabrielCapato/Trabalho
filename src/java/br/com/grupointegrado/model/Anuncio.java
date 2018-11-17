package br.com.grupointegrado.model;

import java.util.Date;

/**
 *
 * @author Gabriel Capato
 */
public class Anuncio {
    
    private int      id;
    private String   Nome;
    private String   tituloAnuncio;
    private String   tipoCombustivel;
    private double   valor;
    private double   KM;
    private String   caminho;
    private Date     anoFabric;
    private Date     anoModelo;
    private String   Descricao;
    private String   categoria;

    public Anuncio() {
    }

    public Anuncio(int id, String Nome, String tituloAnuncio, String tipoCombustivel, double valor, double KM, String caminho, Date anoFabric, Date anoModelo, String Descricao, String categoria) {
        this.id                 = id;
        this.Nome               = Nome;
        this.tituloAnuncio      = tituloAnuncio;
        this.tipoCombustivel    = tipoCombustivel;
        this.valor              = valor;
        this.KM                 = KM;
        this.caminho            = caminho;
        this.anoFabric          = anoFabric;
        this.anoModelo          = anoModelo;
        this.Descricao          = Descricao;
        this.categoria          = categoria;
    }

    public Anuncio(int aInt, String string, java.sql.Date date, java.sql.Date date0, double aDouble, double aDouble0, String string0, String string1, String string2, String string3) {
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTituloAnuncio() {
        return tituloAnuncio;
    }

    public void setTituloAnuncio(String tituloAnuncio) {
        this.tituloAnuncio = tituloAnuncio;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getKM() {
        return KM;
    }

    public void setKM(double KM) {
        this.KM = KM;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Date getAnoFabric() {
        return anoFabric;
    }

    public void setAnoFabric(Date anoFabric) {
        this.anoFabric = anoFabric;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    } 
}