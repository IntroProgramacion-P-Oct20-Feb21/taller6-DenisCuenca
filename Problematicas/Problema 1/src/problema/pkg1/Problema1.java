/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);  
        entrada.useLocale(Locale.US);
       String  nombre;
       int numeroMensualidades;
       String empresa;
       double precioBase=0; 
       double totalPagar= 0;
       double netflix=10;
       double disneyPlus=6;
       double appleTv=4;
       double amazonPrime=4.50;
       double inNetflix ;
       double inDisneyPlus;
       double inAppleTv;
       double inAmazonPrime ;
       double impuesto=0;
       
       
        System.out.println("Ingrese el nombre del usuario");
        nombre = entrada.nextLine();
        
        System.out.printf("Ingrese el servicio que desea cancelar: "
                 + "\n1. Netflix"
                 + "\n2. Disney Plus"
                 + "\n3. Apple TV"
                 + "\n4. Amazon Prime\n");
        
         empresa= entrada.nextLine();
        System.out.println("Ingrese el número de mensualidades a pagar");
         numeroMensualidades= entrada.nextInt();
      
         
         
         switch (empresa){
             case "Netflix":
                 inNetflix= 10;
                 precioBase = numeroMensualidades *  netflix;
                 impuesto = (precioBase*inNetflix)/100;
                 totalPagar= precioBase+impuesto;
                
                 break;
             case "Disney Plus":
                 inDisneyPlus=12;
                 precioBase= numeroMensualidades * disneyPlus;
                impuesto = (precioBase*inDisneyPlus)/100;
                 totalPagar= precioBase+impuesto;
                 break;
             case "Apple TV":
                 inAppleTv= 14;
                 precioBase= numeroMensualidades * appleTv;
                 impuesto = (precioBase*inAppleTv)/100;
                 totalPagar= precioBase+ impuesto;
                 
                 break;
             case "Amazon Prime":
                 inAmazonPrime= 16;
                 precioBase= numeroMensualidades * amazonPrime;
                 impuesto = (precioBase*inAmazonPrime)/100;
                 totalPagar= precioBase+impuesto;
                 break;
                 default:
                     System.out.println("Valor fuera de rango");
                     break;
      
         }
         
         System.out.printf("Usuario: %s\nEmpresa: %s\nPrecio base: "
                 + "$%s\nImpuesto: $%s\nTotal a cancelar: $%.2f\n",
                 nombre,
                 empresa, 
                 precioBase,
                 impuesto,
                 totalPagar);
    }
    
}
