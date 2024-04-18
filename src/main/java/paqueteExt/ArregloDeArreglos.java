
package paqueteExt;

import java.util.Scanner;

public class ArregloDeArreglos {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
     
        System.out.print("Digite la cantidad de vectores que desea: ");
        int numVec=entrada.nextInt();
        
        System.out.print("\nDigite la longitud de los vectores: ");
        int longVec=entrada.nextInt();
        
        int[][] arregloVec=new int[numVec][longVec];
        
        for(int i=0; i<arregloVec.length; i++){
            System.out.println(" ");
            for(int j=0; j<longVec; j++){
                System.out.print("Ingrese el elemento "+(j+1)+": ");
                arregloVec[i][j]=entrada.nextInt();
            }
            System.out.println(" ");
        }
        
        for(int i=0; i<numVec; i++){
            System.out.print(" [");
            for(int j=0; j<longVec; j++){
                System.out.print(arregloVec[i][j]+" ");
            }
            System.out.print("] ");
        }
    }
}
