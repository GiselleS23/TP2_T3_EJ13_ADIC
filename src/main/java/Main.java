/* 13.- Escriba un diagrama que pida al usuario un carácter y un número de repeticiones. Luego muestre el carácter el número de veces especificado.
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char caracter; //debo ponerlo char para charAt
    int repeticiones;
    
    System.out.println("Ingresar un caracter: ");
    caracter = scanner.next().charAt(0); 
    //charat solo tomara el 1er caracter que ponga el usuario
    System.out.println("Ingresar el numero de veces que se repetira: ");
    repeticiones = scanner.nextInt();
    
    for (int i = 1; i <= repeticiones; i++) {
      System.out.print(caracter);
      
    }
    scanner.close();

  }

}