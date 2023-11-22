/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbinario;

// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)


/**
 *
 * @author 
 */


import java.util.Scanner;

public class ExamenBinario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        do {
        System.out.print("Introduzca un número que sea mayor que 0: ");        //he puesto un : y un espacio para que se vea mas estetico                                                   
            n = sc.nextInt();
            i++;
        } while (i < 0);/*i esta inicializado a 0 asi que nunca saldra del bucle
        Por lo tanto cambiare la variable i o hare que se sume o que se reste para poder salir del bucle, ademas la sintaxis estaba mal >=0 en vez de i < 0
        */
        System.out.print("\nBinario: ");
        decBin(n);// aqui habia un fallo de escritura el cual ponia decBinario y no como se llama la funciopn abajo
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(1);
        } else {
            decBin(n / 2);
            System.out.print(n % 2); // aqui habia un fallo el cual elevaba el numero ^2 y es hacer un %, se ve en el debug que la variable cambiaba
        }
    }
}
