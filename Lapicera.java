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
public class Lapicera {
    
//    private String rojo;
//    private String azul;
//    private int tintarojo=100;
//    private int tintaazul=100;
//    
//    public void Escribir(String color,int tinta1){
//        
//        if(color.equals(this.rojo)){
//        if (tinta1<100){
//            
//            this.tintarojo=this.tintarojo-tinta1;}
//            else{
//                    System.out.println("Error tinta insuficiente");
//                    }}
//        if(color.equals(this.azul)){
//            if (tinta1<100){
//            
//            this.tintaazul=this.tintaazul-tinta1;}
//            else {
//                System.out.println("Error tinta insuficiente");
//            }}
//            
//            System.out.println("El color debe ser rojo o azul");
//        
//        
//    }
//    
//  
//    
//    public void CargarTinta(String color,int tinta2 ){
//        
//        if(color.equals(this.rojo)){
//        if (tinta2>0){
//            
//            this.tintarojo=this.tintarojo+tinta2;}
//            }
//        if(color.equals(this.azul)){
//            if (tinta2>0){
//            
//            this.tintaazul=this.tintaazul+tinta2;}
//           }
//            
//            System.out.println("El color debe ser rojo o azul");
//    }
//
//    public int TintaAzul(){
//        
//        return this.tintaazul;
//    }
//    
//    public int TintaRojo(){
//        
//        return this.tintarojo;
//    }

    
    private int rojo=100;
    private int azul=100;
    
    public void escribir(String color,int cantidad){
        
        if (color.equalsIgnoreCase("rojo")){
            if (cantidad<this.rojo){
                this.rojo=this.rojo-cantidad;
            }else {
                System.out.println("no hay cantidad suficiente");
            }
        }
        
        if (color.equalsIgnoreCase("azul")){
            if (cantidad<this.azul){
                this.azul=this.azul-cantidad;
            }else {
                System.out.println("no hay cantidad suficiente");
            }
        }
        
    }
    
    public void cargar(String color,int cantidad){
        
         if (color.equalsIgnoreCase("rojo")){
            
                this.rojo=this.rojo+cantidad;
            
        }
        
        if (color.equalsIgnoreCase("azul")){
            
                this.azul=this.azul+cantidad;
            
        }
        
       
    }
    
    
 
    
}
    
    

