/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeobjetos;

/**
 *
 * @author alumno
 */
public class EjemploDeObjetos {

    /**
     * Necesito una lapicera con dos colores,rojo y azul.
     * Cada uno tiene una cantidad de 100
     * el método escribir recibe el color y la cantidad de tinta a utilizar
     * de no tener la cantidad suficiente se muestra un mensaje.
     * el método cargar tinta recibe el color y la cantidad para cargar
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lapicera miLap= new Lapicera();
        miLap.escribir("rojo", 120);
        miLap.cargar("azul", 50);
        miLap.escribir("rojo", 90);
    }
    
}
