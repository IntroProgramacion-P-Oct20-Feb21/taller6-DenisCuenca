/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador =1;
        int denPar=20;
        int denImpar=10;
        String cadenaFinal="";
        while(contador<=6){
            if ((contador%2)==0){
            cadenaFinal = String.format("%s%s/%s ",cadenaFinal, contador,denPar);
           denPar=denPar+1;
            } else{
            cadenaFinal = String.format("%s%s/%s ",cadenaFinal, contador, denImpar);
            denImpar=denImpar+1;
            }
        contador=contador+1;
        }
        System.out.println(cadenaFinal);
    }
    
}
