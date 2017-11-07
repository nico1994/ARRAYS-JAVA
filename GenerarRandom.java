/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseyobjetos;

/**
 *
 * @author alumno
 */
public class GenerarRandom {
    
    public static String DameUnNombre (){
     String retorno="";
     
     int random=(int) Math.random()*10;
     switch (random){
         
         case 0:
             retorno="alfredo";
             break;
         case 1:
             retorno="rogelio";
             break;
         case 2:
             retorno="Julieta";
             break;
             case 3:
             retorno="nicolas";
             break;
             
             
             
             
     }
     return retorno;
    }
    
     public static String DameUnApellido (){
     String retorno="";
     
     int random=(int) Math.random()*10;
     switch (random){
         
         case 0:
             retorno="mercurio";
             break;
         case 1:
             retorno="agua";
             break;
         case 2:
             retorno="roberto";
             break;
             case 3:
             retorno="nicolas";
             break;
             
             
            
             
     }
     return retorno;
    }
    
     public static int DameUnaEdad (){
        int retorno=0;
        int random=(int) Math.random()*100;
        
        
        return random;
    }
    
    
}
