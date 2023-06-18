/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauri.sve.app.sve.app.dto;

/**
 *
 * @author Amauri
 */
public class Cliente {

    private Long id;
    private String nome;
    private String celular;
    private Boolean whatsapp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", celular=" + celular + ", whatsapp=" + whatsapp + '}';
    }
    
    

    
    
}
