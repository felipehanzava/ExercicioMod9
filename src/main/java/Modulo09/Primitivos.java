package Modulo09;

import java.util.Scanner;

public class Primitivos {

    public static void main(String[] args) {
        Integer valor ;
        int valor_primitivo;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        valor = input.nextInt();
        System.out.println(valor);
        System.out.println("Informe um valor: ");
        valor_primitivo = input.nextInt();
        System.out.println(valor_primitivo);

        Integer valor_wrapper;
        valor_wrapper = valor_primitivo;
        int valor2 = valor.intValue();
        System.out.println(valor2);
        System.out.println(valor_wrapper);
        }
}

