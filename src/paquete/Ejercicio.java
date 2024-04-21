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
        double resultado = 0;
        do {
            try{
                System.out.print("Introduce el valor para la variable A: ");
                variableA = sc.nextInt();

                System.out.print("Introduce el valor para la variable B: ");
                variableB = sc.nextInt();

                if (variableA <= variableB) {
                System.out.println("Error: El valor de A debe ser mayor que el de B.");
                }
            } catch (Exception ex){
                System.out.println("Introduce los valores correctos");
                }
        } while (variableA <= variableB);
        
        System.out.println("Los valores introducidos son: A = " + variableA + ", B = " + variableB);
        
        int op = -1;
        do{
            try{
            sc = new Scanner(System.in);
            System.out.println("Que operacion desea realizar?");
            System.out.println("1 - Sumar los dos valores");
            System.out.println("2 - Restar los dos valores");
            System.out.println("3 - Multiplicar los dos valores");
            System.out.println("4 - Dividir los dos valores");
            System.out.println("0 - Salir del menu"); 
            op = sc.nextInt();
            
            switch (op){
                case 1:
                    resultado = variableA + variableB;
                    System.out.println("Resultado de la suma de " + variableA + " + " + variableB + " = " + resultado);
                    break;
                case 2:
                    resultado = variableA - variableB;
                    System.out.println("Resultado de la suma de " + variableA + " - " + variableB + " = " + resultado);
                    break;
                case 3:
                    resultado = variableA * variableB;
                    System.out.println("Resultado de la suma de " + variableA + " * " + variableB + " = " + resultado);
                    break;
                case 4:
                    resultado = variableA / variableB;
                    System.out.println("Resultado de la suma de " + variableA + " / " + variableB + " = " + resultado);
                    break;
                case 0:
                    System.out.println("saliendo del menu");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Hay que introduccion valores del 0 al 4");
            }
            }catch(Exception ex){
                System.out.println("Introduce los valores correctos");
            }
        } while (op != 0);
    }
}
