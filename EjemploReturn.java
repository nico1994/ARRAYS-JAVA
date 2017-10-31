/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploreturn;

/**
 *
 * @author alumno
 */
public class EjemploReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] alumno={"maria","manuel","diego","estela","martin"};
        int [] notas={10,2,5,2,7};
        int aux;
        aux=EjemploReturn.RetornarPromedio(notas);
        System.out.println(aux);
        
        
    }
        
    public static int RetornarCantidadDeAprobados(int[] miparametro){
            
            
            int resultado=0;
            for (int i = 0; i < miparametro.length; i++) {
                if (miparametro[i]>3){
                    resultado++;
                }
            }
            return resultado;
            
            
        }
        
        
    public static int RetornarPromedio(int[] miparametro){    
    //hacerlo con float tmb
        int promedio;
        int suma=0;
        for (int i = 0; i < miparametro.length; i++) {
            suma=suma+miparametro[i];
            
        }
        promedio=suma/miparametro.length;
        return promedio;
    
    

}

    public static String RetornarNombreDeLaMejorNota(int[] notas,String[] nombres)
{
        String retorno="";
        //parta mañana nombre menor 
        for (int i = 0; i < notas.length; i++) {
            
            if()
        
    }


   

        return retorno;
}


}