/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_recursividad;

/**
 *
 * @author aleja
 */
public class EVA1_13_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoFor(5);//5-4-3-2-1
    }
    public static void falsoFor(int val){
        System.out.println(val+"-");//RESOLVER UN PROBLEMA
        if(val>1)    //DEBEMOS DE DETENER LA RECUSRIVIDAD
        falsoFor(val-1);//LLAMARSE A SI MISMO
    
    }
       
    
}
