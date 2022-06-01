package domain;

import java.util.Scanner;

public class Decision1_al_10 {

    static Scanner entrada = new Scanner(System.in);

    /*
    Leer un número entero y determinar si es un número terminado en 4.
     */
    public static void TerminaEn4() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("El numero ingresado es: " + numero);
        int comprobacion = numero % 10;

        if ((comprobacion) == 4) {
            System.out.println("Termina en " + 4);
        } else {
            System.out.println("no termina en " + 4);
        }

    }

    /*
    Leer un número entero y determinar si tiene 3 dígitos.
     */
    public static void TresDigitos() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        if (numero >= 1 && numero < 9) {
            System.out.println("El numero tiene un digito.");
        } else if (numero > 10 && numero < 99) {
            System.out.println("El numero tiene dos digitos.");
        } else if (numero > 100 && numero < 999) {
            System.out.println("El numero tiene tres digitos.");
        } else if (numero > 1000 && numero < 9000) {
            System.out.println("El numero tiene cuatro digitos.");
        } else {
            System.out.println("El numero tiene mas de cuatro digitos.");
        }

    }

    /*
     Leer un número entero y determinar si es negativo.   
     */
    public static void NumeroNegativo() {
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Es un numero negativo.");
        } else {
            System.out.println("No es un numero negativo");
        }
    }

    /*
    Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos.
     */
    public static void SumaDigitos() {
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();
        int parte2 = numero % 10;
        int parte1 = numero / 10;
        int resultado;

        if (numero >= 10 && numero <= 99) {
            resultado = parte1 + parte2;
            System.out.println("La suma del numero es: " + resultado);

        } else {
            System.out.println("El digito ingresado no es de dos digitos.");
        }
    }

    /*
    Leer un número entero de dos dígitos y determinar si ambos dígitos son pares.
     */
    public static void AmbosPares() {

        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();
        int parte1 = numero / 10;
        int parte2 = numero % 10;
        isPar(parte1);
        isPar(parte2);
    }

    //Funcion para determinar si es par o no.
    public static void isPar(int numero) {

        if ((numero % 2) == 0) {
            System.out.println("El " + numero + ", es par.");
        } else {
            System.out.println("El " + numero + ", no es par.");
        }
    }

    /*
    Leer un número entero de dos dígitos menor que 20 y determinar si es primo.
     */
    public static void menorPrimo() {
        int acum = 0;
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Numero menor a 20.");
        } else if (numero < 20 && numero >= 1) {

            //Verificamos el numero sacando su residuo
            for (int i = 1; i <= numero; i++) {
                int residuo = numero % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2) {
                System.out.println("El " + numero + " es primo.");
            }

        } else {
            System.out.println("El numero es mayor a 20");
        }
    }

    /*
    Leer un número entero de dos dígitos y determinar si es primo y además si es negativo.
     */
    public static void menorPrimoNegativo() {
        int acum = 0;
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("El numero es negativo, me interesa.");
            numero = numero * (-1);
            //Verificamos el numero sacando su residuo
            for (int i = 1; i <= numero; i++) {
                int residuo = numero % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2) {
                System.out.println("El " + numero + " es primo y negativo.");
            } else {
                System.out.println("El " + numero + " no es primo, pero si es negativo.");
            }

        } else {
            System.out.println("El numero es positivo, no me interesa.");
        }
    }

    /*
    Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.
     */
    public static void digitosPrimos() {
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();
        int parte1 = numero / 10;
        int parte2 = numero % 10;

        if (numero > 10 && numero < 99) {
            numPrimo(parte1);
            numPrimo(parte2);
        }

    }

    public static void numPrimo(int numero) {
        int acum = 0, cont = 0;
        //Verificamos el numero sacando su residuo
        for (int i = 1; i <= numero; i++) {
            int residuo = numero % i;
            if (residuo == 0) {
                acum++;
            }
        }

        if (acum == 2) {
            System.out.println("El " + numero + " es primo");
        } else {
            System.out.println("El " + numero + " no es primo.");
        }

    }

    /*
    Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro.
     */
    public static void compararMultiplo() {
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }
        int parte1 = numero / 10;
        int parte2 = numero % 10;

        System.out.println("numero 1: " + parte1);
        System.out.println("numero 2: " + parte2);

        int prueba1 = parte2 % parte1;
        int prueba2 = parte1 % parte2;

        if (numero > 9 && numero <= 99) {

            if (prueba1 == 0 || prueba2 == 0) {
                System.out.println("Un digito es multiplo de otro.");

            } else {
                System.out.println("Ningun digito es multiplo del otro.");
            }

        } else {
            System.out.println("El numero ingresado es mayor de 2 digitos.");
        }
    }

    /*
    Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales
     */
    public static void compararDigitos() {
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }
        int parte1 = numero / 10;
        int parte2 = numero % 10;

        if (parte1 == parte2) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros no son iguales.");
        }
    }

}
