/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unioeste.geral.bo.endereco;

import java.io.Serializable;

/**
 *
 * @author leoscalco
 */
public class Bairro implements Serializable{
    int codigo;
    String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public void setNome(String bairro){
        this.nome = bairro;
    }
    
    public String getNome(){
        return nome;
    }
}
