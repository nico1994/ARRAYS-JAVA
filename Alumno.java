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
public class Alumno {
    //nombre apellido,correo,sexo,fecha de nacimiento,localidad,direccion,legajo,dni.
    //crear estos atributos y generar 10 objetos ALUMNOS.
//    public String nombre;
//    public String apellido;
//    public String correo;
//    public String sexo;
//    public String fechadenacimiento;
//    public String localidad;
//    public String direccion;
//    public int legajo;
//    public int dni;
//    
//    public void MostrarDatosAlumno(){
//        
//        System.out.println(this.nombre);
//        System.out.println(this.apellido);
//        System.out.println(this.correo);
//        System.out.println(this.sexo);
//        System.out.println(this.fechadenacimiento);
//        System.out.println(this.localidad);
//        System.out.println(this.direccion);
//        System.out.println(this.legajo);
//        System.out.println(this.dni);
    
    
    /**
     * nombre> 3 letras o "nn"
     * apellido>3 letras o "nn"
     * correo> 8letras o"nn"
     * sexof o m o "esta mal"
     * fechaNc
     * Localidad> 4 letras o "mal"
     * direccion>8 letras o "mal direccion"
     * legajo de 6 caracteres o "mal" 
     * dni = 8 caracteres
     * para la salida todos los textos en mayusculas
     */
    
    private String _nombre;
    private String _apellido;
    private String _correo;
    private String _sexo;
    private String _fechaNacimiento;
    private String _localidad;
    private String _direccion;
    private String _legajo;
    private String _dni;
    
    public void SetNombre(String unNombre){
        
        if (unNombre.length()>3){
        this._nombre=unNombre;    
        }else {
            this._nombre="nn";
        }}
    public String GetNombre(){
        
        return this._nombre.toUpperCase();
     }
    
    public void SetApeliido(String unApellido){
        
        if (unApellido.length()>3){
        this._apellido=unApellido;    
        }else {
            this._apellido="nn";
        }
    }
    
    public String GetApellido(){
        
        
    return this._apellido.toUpperCase();
}
    
    public void SetCorreo(String unCorreo){
        
        if (unCorreo.length()>8){
        this._correo=unCorreo;    
        }else {
            this._correo="nn";
        }
        
    }
    public String GetCorreo(){
        
        return this._correo.toUpperCase();
    }
    
    public void SetSexo(String sexo){
        
        if (sexo.equals("m")|| sexo.equals("f")){
            this._sexo=sexo;
    }else{
            this._sexo="Esta mal.";
        }
    
}
    
    public String GetSexo(){
        return this._sexo.toUpperCase();
    }
    
    public void SetFechaNac(String fecha){
        
        this._fechaNacimiento=fecha;
        
    }
    public String GetFechaNac(){
        
        
        return this._fechaNacimiento.toUpperCase();
        
    }
    
    public void SetLocalidad(String localidad){
        
        if(localidad.length()>4){
            this._localidad=localidad;
        }else{
            this._localidad="Esta mal";
        }
    }
    
    public String GetLocalidad(){
        return this._localidad.toUpperCase();
    }
    
    public void SetDireccion(String direccion){
        
        if(direccion.length()>8){
            this._direccion=direccion;
        }else {
            this._direccion="Esta mal";
        }
        
    }
    
    public String GetDireccion(){
        
        return this._direccion.toUpperCase();
        
    }
    
    public void SetLegajo(String legajo){
        
        if (legajo.length()>6){
            this._legajo=legajo;
        }else{
            this._legajo="esta mal";
            
        }
        
    }
    
    public String GetLegajo(){
        
        return this._legajo.toUpperCase();
        
    }
    
    public void SetDni(String dni){
        
        if(dni.length()>8){
            
            this._dni=dni;
        }else{
            this._dni="Esta mal";
        }
        
        
    }
    
    public String GetDni(){
        return this._dni.toUpperCase();
    }
    
//    public void MostrarDatos(){
//        
//        System.out.println(GetNombre());
//        System.out.println(GetApellido());
//        System.out.println(GetCorreo());
//        System.out.println(GetSexo());
//        System.out.println(GetFechaNac());
//        System.out.println(GetLocalidad());
//        System.out.println(GetDireccion());
//        System.out.println(GetLegajo());
//        System.out.println(GetDni());
//       
//    }
//    
    public void MostrarInstanciaAlumno(){
        //1er version
        System.out.println(""+this._nombre);
        System.out.println(""+this._apellido);
        System.out.println(""+this._correo);
        System.out.println(""+this._sexo);
        System.out.println(""+this._fechaNacimiento);
        System.out.println(""+this._localidad);
        System.out.println(""+this._nombre);
        System.out.println(""+this._nombre);
        System.out.println(""+this._nombre);
        System.out.println(""+this._nombre);
        //2da version
        //Alumno.MostrarDatosAlumno(this);
    }
    public static void MostrarDatosAlumno(Alumno unALguien){
        //System.out.println("nombre: "+unALguien.GetNombre());
        //1er version
          unALguien.MostrarInstanciaAlumno();
        //2da version
//        System.out.println(" "+unALguien.GetNombre());
//        System.out.println(" "+unALguien.GetApellido());
//        System.out.println(" "+unALguien.GetCorreo());
//        System.out.println(" "+unALguien.GetSexo());
//        System.out.println(" "+unALguien.GetFechaNac());
//        System.out.println(" "+unALguien.GetLocalidad());
//        System.out.println(" "+unALguien.GetDireccion());
//        System.out.println(" "+unALguien.GetLegajo());
//        System.out.println(" "+unALguien.GetDni());
    }
    
}