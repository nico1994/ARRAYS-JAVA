/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * 
 */
public class Persona {
    private String _nombre;
    private String _apellido;
    //constructor publico
    public Persona(String nom,String ape){
        
        this._nombre=nom;
        this._apellido=ape;
     }
    
    public void MostrarPersona()
    {
        System.out.println("nombre: "+this._nombre+" apellido: "+this._apellido);
        
    }
    
    public static Persona RetornarPersonaRandom()
    {
        Persona Retorno=new Persona("natalia", "natalia");
        
        
        
        return Retorno;
    
    }
}
