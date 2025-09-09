/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_fibonacci;

/**
 *
 * @author aleja
 */
public class EVA1_16_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fibonacci(6)= "+ fibonacci(1000));
    }
    public static int fibonacci(int fibo){
       
        if (fibo==0||fibo==1){
            return 1;
        }
      return  fibonacci(fibo-2)+ fibonacci(fibo-1);
        
      
    }
}
