/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author faria
 */
public class Retangulo {
    
    //Atributos do Retangulo
    public float base = 0;
    public float altura = 0;
            
    //Metodos do Retangulo
    public float calcularArea(){
        if(altura < 0 || base < 0){
            return -1;
        }            
        return base*altura;
    }
    public float calcularPerimetro(){
        return (base*2)+(altura*2);
    }
}
