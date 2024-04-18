

package paqueteExt;

import java.util.Scanner;

public class MismaDimensionOno {

    public static void main(String[] args) {
         
        Scanner entrada=new Scanner (System.in);
        System.out.println("Digite la dimension del primer vector: ");
        int dim1=entrada.nextInt();
        
        System.out.println("Digite la dimension del segundo vector: ");
        int dim2=entrada.nextInt();
        
        int vector1[]=new int[dim1];//int[] vector1 = {1, 2, 3, 4, 5};
        int vector2[]=new int[dim2];//int[] vector2 = {6, 7, 8, 9, 10};

        for(int i=0; i<vector1.length; i++){
            System.out.print((i+1)+".Digite el vector1: ");
            vector1[i]=entrada.nextInt();
        }
        System.out.println(" ");
        for(int i=0; i<vector2.length; i++){
            System.out.print((i+1)+".Digite el vector2: ");
            vector2[i]=entrada.nextInt();
        }

        if(vector1.length == vector2.length){
            System.out.println("Los vectores tienen la misma dimension\n");
            
            System.out.println("PRIMER VECTOR: ");
            for(int i=0; i<vector1.length; i++){
                System.out.print(vector1[i]+" ");
            }
            
            System.out.println("\nSEGUNDO VECTOR: ");
            for(int i=0; i<vector2.length; i++){
                System.out.print(vector2[i]+" ");
            }
        }
        else{
            System.out.println("Los vectores no tienen la misma dimension");
            
             System.out.println("PRIMER VECTOR: ");
            for(int i=0; i<vector1.length; i++){
                System.out.print(vector1[i]+" ");
            }
            
            System.out.println("\nSEGUNDO VECTOR: ");
            for(int i=0; i<vector2.length; i++){
                System.out.print(vector2[i]+" ");
            }
        }
    }
}
