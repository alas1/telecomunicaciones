/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        // crear una nueva instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        // leer el numero de elementos
        System.out.print("Ingrese el número de elementos del arreglo: ");
        int numero = sc.nextInt();
        // crear una instancia de la clase MiArreglo
        Repetidos notas = new Repetidos(numero);
        // ingresar elementos al arreglo
        notas.leer();
        
        // determinar el numero de veces que aparece las notas
       // notas.frecuencia();
    }
}

   
