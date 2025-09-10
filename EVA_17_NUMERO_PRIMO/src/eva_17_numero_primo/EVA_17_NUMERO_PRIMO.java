/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_17_numero_primo;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class EVA_17_NUMERO_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INGRESA UN NUMERO PARA REVISAR SI ES PRIMO O NO");
        Scanner cap = new Scanner(System.in);
      int num=cap.nextInt();
   System.out.println(esPrimoNoEficiente(num));
   System.out.println(esPrimoEficiente(num));
    }
    public static boolean esPrimoNoEficiente(int num){
    if (num <=1) {
        return false; 
    }
        
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
          return true;
}
    public static boolean esPrimoEficiente(int num){
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
    }
}
