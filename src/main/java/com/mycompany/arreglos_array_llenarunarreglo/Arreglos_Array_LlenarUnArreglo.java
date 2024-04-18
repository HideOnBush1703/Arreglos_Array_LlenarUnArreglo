
package com.mycompany.arreglos_array_llenarunarreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos_Array_LlenarUnArreglo {

    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     //////////////////////////////////////////////////////////////////////////////
    int nElementos;
    
    nElementos=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
    
    char[] letras=new char[nElementos];
    
        System.out.println("digite los elementos del arreglo: ");
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+".Digite un caracter: ");
        letras[i]=entrada.next().charAt(0);       
        }
        
        System.out.print("\nLos caracteres del arreglo son: ");
        for (int i=0; i<nElementos; i++){
         System.out.print(letras[i]+" ");            
        }
       
         
    }
}
