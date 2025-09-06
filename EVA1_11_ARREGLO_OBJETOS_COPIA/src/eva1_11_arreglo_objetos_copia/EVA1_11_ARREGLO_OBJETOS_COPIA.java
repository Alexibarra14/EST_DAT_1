/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_arreglo_objetos_copia;

/**
 *
 * @author aleja
 */
public class EVA1_11_ARREGLO_OBJETOS_COPIA {

    /**
     * @param args the command line arguments
     */
    
       
/**
 *
 * @author oujeffu
 */
public class EVA1_11_COPIA_ARREGLO_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [] perso1= new Persona[2];
        perso1 [0]= new Persona("Juan", "Perez");
        System.out.println(perso1[0]);
        perso1[1]= new Persona("Aletz", "Ibarra");
        System.out.println(perso1[1]);
        imprimir(perso1);
        Persona [] respaldo= new Persona [perso1.length];
        respaldo[0]= new Persona();
        System.out.println(respaldo[0]);
        respaldo[1]= new Persona();
        System.out.println(respaldo[1]);
                
        copyArrayOfClasses(perso1,respaldo);
        imprimir(respaldo);
    }
    
    public static void copyArrayOfClasses(Persona[] origen, Persona[] copia){
        for (int i = 0; i < origen.length; i++) {
            copia[i].setNombre(origen[i].getNombre());
            copia[i].setApellido(origen[i].getApellido());
            
        }
        
    }


class Persona{
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
}