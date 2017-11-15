/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * @author alumno
 */
public class EjemploFacturacion {

    /**
     * 
     */
    public static void main(String[] args) {
        
        // registrar una venta
        
//        Persona unCliente=new Persona("José","Feliz");
//        Persona unEmpleado= new Persona("Martín","Fierro");
        
        Producto miProd1= new Producto();
        
//        miProd1.SetterDescrip("fanta");
//        miProd1.SetterPrecio(35);
//        miProd1.SetterCantidad(3);
//        
//        Producto miProd2= new Producto();
//        
//        miProd2.SetterDescrip("coca cola");
//        miProd2.SetterPrecio(45);
//        miProd2.SetterCantidad(3);
//        
//        Producto miProd3= new Producto();
//        
//        miProd3.SetterDescrip("sprite");
//        miProd3.SetterPrecio(40);
//        miProd3.SetterCantidad(3);
        
        
        
        Venta miVenta= new Venta();
        
        miVenta.elCliente=Persona.RetornarPersonaRandom();
        miVenta.miEmpleado=Persona.RetornarPersonaRandom();
        
        //miVenta.productoVendido=miProd;
////        miVenta.ListadoProductos[0]=miProd1;
////        miVenta.ListadoProductos[1]=miProd2;
////        miVenta.ListadoProductos[2]=miProd3;
        miVenta.CargarProducto(Producto.RetornarProductoRandom());
        miVenta.CargarProducto(Producto.RetornarProductoRandom());
        miVenta.CargarProducto(Producto.RetornarProductoRandom());
        
//        miVenta.CargarProducto(miProd4);
        miVenta.MostrarVenta();
    }
    
}