/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera=true;
        String n1;
        String nombre;
        int numeroDias;
        double costoDia;
        double sueldo;
        String cadenaFinal="";
        
        while (bandera){
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de días trabajados ");
        numeroDias=entrada.nextInt();
        System.out.println("Ingrese el costo del día de trabajo");
        costoDia=entrada.nextDouble();
        
        sueldo= numeroDias*costoDia;
        cadenaFinal=String.format("%s%s\t%s\t$%s\t$%.2f\n", 
                cadenaFinal,
                nombre,
                numeroDias,
                costoDia,
                sueldo);
        
            System.out.println("Esriba 'no' para salir del bucle ");
             entrada.nextLine();
            n1= entrada.nextLine();
            if (n1.equals("no")){
            bandera = false;
            }
        }
        System.out.println(cadenaFinal);
    }
    
}
