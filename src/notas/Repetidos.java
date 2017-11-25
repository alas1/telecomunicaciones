

package notas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Repetidos {
      // definición de los miembros de la clase
    private int[] datos;
    
    // definición del constructor
    public Repetidos(int numero){
        // dimensionar el arreglo
        this.datos = new int[numero];
    }   
    // procedimiento que permite ingresar todos los elementos del arreglo
    public void leer() {
        // recorrer el arreglo e ingresar sus nuevos elementos
        for (int i = 0; i <= this.datos.length - 1; i++)
        {
            this.datos[i] = Leer_Nota(String.format("%sa", i + 1));
        }
    }
    
    // función que permite leer una nota correcta
    private int Leer_Nota(String Orden) {
        // crear una nueva instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        // declarar una variable donde leer la nota
        int numero_ingresa = 0;
        
        // declarar una variable de control
        boolean Nota_correcta = false;
       
            // leer una nota
            System.out.print("Ingrese el  " + Orden + "numero : ");
            numero_ingresa = sc.nextInt();
            // rrecorer el array
            for (int i = 0; i < this.datos.length ; i++){
            //verificar si elemento ya existe en array
              if (numero_ingresa != this.datos[i]) {
                // modificar el valor de la variable de control
                Nota_correcta = true;
              }
           
              else {
                // mostrar mensaje de error
                System.out.println("Elemento YA EXISTE !!!. Por favor vuelva a intentarlo...");
                Leer_Nota(Orden);
               }
        
            }
            
        // retornar el valor de la funciónreturn this.datos.length;
        return numero_ingresa;
    }
    

    

    
    
}

    

