/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseyobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploClaseYObjetos {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        // estatico
//        int edad=33;
//        Calculadora.mostrarEstatico(edad);
//        // para llamar de instancia
//        Calculadora miCal= new Calculadora();
//        miCal.MostrarInstancia();
        
//        Usuario unUsuario;
//        unUsuario=new Usuario();
//        unUsuario.DameNombre("natalia natalia");
//        unUsuario.DameClave("6665");
//        System.out.println("el nombre es : "+unUsuario.GetNombre());
//        unUsuario.mostrarDatos();
//        Scanner misc=new Scanner(System.in);
//        String aux;
//        for (int i = 0; i < 10; i++) {
//            
//            System.out.println("¿Cual es su nombre?");
//            nuevoAlumno.nombre=misc.next();
//            
//            System.out.println("Cual es su apelllido");
//            nuevoAlumno.apellido=misc.next();
//            
//            System.out.println("¿Cual es su correo?");
//            nuevoAlumno.correo=misc.next();
//            
//            System.out.println("Cual es su sexo?");
//            nuevoAlumno.sexo=misc.next();
//            
//            System.out.println("¿Cual es su Fecha de Nacimiento?");
//            nuevoAlumno.fechadenacimiento=misc.next();
//            
//            System.out.println("Cual es su Localidad");
//            nuevoAlumno.localidad=misc.next();
//            
//            System.out.println("¿Cual es su direccion?");
//            nuevoAlumno.direccion=misc.next();
//            
//            System.out.println("Cual es su legajo");
//            aux=misc.next();
//            nuevoAlumno.legajo=Integer.parseInt(aux);
//            
//            System.out.println("Cual es su dni");
//            aux=misc.next();
//            nuevoAlumno.dni=Integer.parseInt(aux);
//            
//            nuevoAlumno.MostrarDatosAlumno();
//        }

        Alumno nuevoAlumno;
        nuevoAlumno=new Alumno();
        
        nuevoAlumno.SetNombre("N");
        nuevoAlumno.SetApeliido("Lo ");
        nuevoAlumno.SetCorreo("Nico");
        nuevoAlumno.SetSexo("q");
        nuevoAlumno.SetFechaNac("1 de agosto");
        nuevoAlumno.SetLocalidad("avel");
        nuevoAlumno.SetDireccion("mendez 1565");
        nuevoAlumno.SetLegajo("qweqweqwe");
        nuevoAlumno.SetDni("2141234231");
        nuevoAlumno.MostrarInstanciaAlumno();

        Alumno[] arrayAlumnos;
        arrayAlumnos=new Alumno[3];
        
        Alumno aux1=new Alumno();
        aux1.SetNombre("niclas");
        
        Alumno aux2=new Alumno();
        aux2.SetNombre("asd");

        //testeo
        for (int i = 0; i < 10; i++) {
            String nombre=Genera
            arrayAlumnos[i]=new Alumno();
            int edad=GenerarRandom.DameUnaEdad();
            
        }
       
        
    }
    
}
