/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mcd;

/**
 *
 * @author aleja
 */
public class EVA1_15_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("EL MAXIMO COMUN DIVISOR ES:"+ mcd(180, 48));
       
    }
 
    public static int mcd(int dividendo, int divisor) {
        int residuo = dividendo%divisor;
        if (residuo == 0) { 
            return divisor; // Caso base
        } else {
            return mcd(divisor,residuo);
        }
    }

   

}
