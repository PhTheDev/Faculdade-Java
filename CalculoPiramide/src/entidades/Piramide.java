/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author faria
 */
public class Piramide {
    
    //Atributos da piramide
    public float base = 0;
    public float altura = 0;
    
    //Metodos da piramide
    public float calcularVolume(){
        return (float) (0.75 *(base*altura));
    }
  }
}
