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
public class Endereco implements Serializable{
    int codigo;
    String cep;
    Logradouro rua;
    Bairro bairro;
    Cidade cidade;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Logradouro getRua(){
        return rua;
    }
    
    public Bairro getBairro(){
        return bairro;
    }
    
    public Cidade getCidade(){
        return cidade;
    }

    public void setRua(Logradouro rua){
        this.rua = rua;
    }
    
    public void setBairro(Bairro bairro){
        this.bairro = bairro;
    }
    
    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }
}
