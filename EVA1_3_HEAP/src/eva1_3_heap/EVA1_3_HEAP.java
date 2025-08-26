/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_heap;

/**
 *
 * @author aleja
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        prueba pr = new prueba();//REFERENCIA
        prueba pr2 = new prueba();//REFERENCIA
        System.out.println("x="+x);
        System.out.println("prueba1="+pr);
        System.out.println("prueba2="+pr2);
        System.out.println("Prueba1.valor= "+pr.valor);
      pr=null;//ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLES Y MEMORIA
      pr2=null;//ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLES Y MEMORIA
      }
    }
    

class prueba{
    int valor=100;
    
}