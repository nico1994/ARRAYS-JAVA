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
public class Usuario {
//es de instancia
    
    //son variables que llamamos atributos
private String nombre;
private String clave;

//metodos getters. Devuelven
public String GetNombre(){
    
    
    
    return this.nombre.toUpperCase();//devuelve en mayuscula
}

public String GetClave(){
    
    return this.clave;
    
}

//metodos setter no devuelven, sino que asignan public void SetNombre
public void DameNombre(String dato){
    
    this.nombre=dato;
    
}//metodos Setter public void Setclave
public void DameClave(String dato){
    
    if (dato.length()<4){
        this.clave="mal";
    }else{
        this.clave=dato;
    }
    
    
    
}

public void mostrarDatos(){
    
    System.out.println("su nombre es : "+ this.GetNombre()+" clave: "+this.clave);
    
}

    
}
