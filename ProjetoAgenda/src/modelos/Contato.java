/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Contato extends persistencia.ContatoDao{
    //Atributos
    String nomeCompleto = "";
    Telefone telefone = null;
    String email = "";
    String endereco = "";
    
    //Metodos
    public Contato(String nomeCompleto, Telefone telefone, String email, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Contato() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
}
