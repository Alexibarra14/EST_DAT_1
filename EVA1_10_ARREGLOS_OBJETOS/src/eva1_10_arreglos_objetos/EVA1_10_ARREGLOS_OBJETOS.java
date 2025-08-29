/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_arreglos_objetos;

/**
 *
 * @author aleja
 */
public class EVA1_10_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejemplo[] arreglo= new ejemplo[2];
        System.out.println(arreglo);
        arreglo[0]= new ejemplo();
        System.out.println(arreglo[0].val);
        arreglo[1]= new ejemplo();
                System.out.println(arreglo[1]);
                System.out.println(arreglo[1]);
    }
    
}
class ejemplo{
    int val=100;
    
}