/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_tamano;

/**
 *
 * @author aleja
 */
public class EVA1_9_TAMANO {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo= new int[10];
        llenar(arreglo);
        imprimir(arreglo);
       //
      int copia[] = new int [arreglo[5]];
      for(int i=0;i<arreglo[i]; i++)
          copia[i]= arreglo[i];

// Imprimir copia
System.out.println("COPIA"  );
imprimir(copia);
         
       
        
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