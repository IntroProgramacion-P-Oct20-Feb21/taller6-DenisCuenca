/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador= 1;
        String nombre;
        String cadenaFinal="";
        double promedio;
        String resultado;
        while(contador<=4){
            System.out.println("Ingrese el nombre del estudiante");
            nombre=entrada.nextLine();
            System.out.println("Ingrese el promedio del estudiante");
            promedio=entrada.nextDouble();
            entrada.nextLine();
            if (promedio>=7){
            resultado="Aprobado";
            cadenaFinal = String.format("%s%s\t%s\t%s\n",
                    cadenaFinal,
                    nombre,
                    promedio,
                    resultado); 
            
            }else{
            resultado="Reprobado";
            cadenaFinal = String.format("%s%s\t%s\t%s\n",
                   cadenaFinal,
                   nombre,
                   promedio,
                   resultado); 
            }
            contador+=1;
          
        }
        System.out.println(cadenaFinal);
    }
    
}
