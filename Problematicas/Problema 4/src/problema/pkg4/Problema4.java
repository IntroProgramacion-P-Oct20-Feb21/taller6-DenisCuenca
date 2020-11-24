/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner(System.in);
        int contador = 1;
        String nombre;
        String cadenaFinal="";
        int puntos;
        int faltas;
        while (contador<=10){
            System.out.println("Ingrese el nombre del jugador");
            nombre= entrada.nextLine();
            System.out.println("Ingrese la cantidad de puntos anotados por el jugador");
            puntos=entrada.nextInt();
            System.out.println("Ingrese las faltas cometidas por el jugador");
            faltas=entrada.nextInt();
            cadenaFinal= String.format("%s%s\t%s\t%s\n",
                    cadenaFinal,
                    nombre,
                    puntos,
                    faltas);
            
            contador+=1;
            entrada.nextLine();
        }
        System.out.println(cadenaFinal);
    }
    
}
