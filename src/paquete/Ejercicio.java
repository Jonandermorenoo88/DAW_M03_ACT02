/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author Jon Ander Incera Moreno
 */
public class Ejercicio {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int variableA = 0;
        int variableB = 0;
        double redultado = 0;
        do {
            System.out.print("Introduce el valor para la variable A: ");
            variableA = sc.nextInt();

            System.out.print("Introduce el valor para la variable B: ");
            variableB = sc.nextInt();

            if (variableA <= variableB) {
                System.out.println("Error: El valor de A debe ser mayor que el de B.");
            }
        } while (variableA <= variableB);
        System.out.println("Los valores introducidos son: A = " + variableA + ", B = " + variableB);
        
        int op = -1;
        do{
            sc = new Scanner(System.in);
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1 - Sumar los dos valores");
            System.out.println("2 - Restar los dos valores");
            System.out.println("3 - Multiplicar los dos valores");
            System.out.println("4 - Dividir los dos valores");
            System.out.println("0 - Salir del menu"); 
            op = sc.nextInt();
            
            
            
        } while (op != 0);
    }
}
