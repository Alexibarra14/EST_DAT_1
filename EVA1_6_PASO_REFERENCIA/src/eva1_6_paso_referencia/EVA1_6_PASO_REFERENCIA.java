/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_paso_referencia;

/**
 *
 * @author aleja
 */
public class EVA1_6_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo= new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        System.out.println("");
        int[] arreglo2= new int[50];
        llenar(arreglo2);
        imprimir(arreglo2);
    }// LLENAR USA PASO POR REFERENCIA
    // RECIBE LA DIRECCION DEL ARREGLO Y LA USA PARA MODIFICARLO
    public static void llenar(int[] datos){
        for(int i= 0;i<datos.length;i++){
            datos[i]= (int) (Math.random()*100);
        }
    }
    //IMPRIMIR USA PASO POR REFERENCIA TAMBIEN, PERO NO MODIFICA
    // EL ARREGLO, SOLO LO LEE
    public static void imprimir (int[]datos){
        for(int i= 0;i<datos.length;i++){
            System.out.println("["+datos[i]+"]");
        }
    }
}
