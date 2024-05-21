/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
public class Telefone {
    //Atributos
    protected int ddi = 0;
    protected int ddd = 0;
    protected int numero = 0;
    
    //Metodos
    public Telefone(int ddi, int ddd, int numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone() {
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "+" + ddi + "(" + ddd + ")" + numero;
    }
    
    
}
