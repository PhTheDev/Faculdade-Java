/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author faria
 */
public class Esfera {
    
    //Atributos da esfera
    public float raio = 0;
    
    //Metodos da esfera
    public float calcularArea(){
        
        return (float)(3.14159*(raio*raio));
    }
    public float calcularVolume(){
        
        return (float) (0.75 * 3.14159 * (raio * raio)) ;
    }
}
