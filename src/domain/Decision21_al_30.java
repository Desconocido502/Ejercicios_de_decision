package domain;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;
import java.util.Scanner;

public class Decision21_al_30 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer tres números enteros de dos dígitos cada uno y determinar en cuál de 
    ellos se encuentra el mayor dígito.
     */
    public static void mayorDigitoEnTresNumeros() {
        System.out.print("Ingrese un numero entero(2 digitos): ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero(2 digitos): ");
        int numero2 = entrada.nextInt();
        System.out.print("Ingrese un numero entero mas(2 digitos):  ");
        int numero3 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
            numero3 = numero3 * (-1);
        }

        int digito1 = numero1 / diez;
        int digito2 = numero1 % diez;

        int digito3 = numero2 / diez;
        int digito4 = numero2 % diez;

        int digito5 = numero3 / diez;
        int digito6 = numero3 % diez;

        if ((digito1 > digito3 && digito1 > digito4) || (digito2 > digito3 && digito2 > digito4)) {

            if ((digito1 > digito5 && digito1 > digito6) || (digito2 > digito5 && digito2 > digito6)) {
                System.out.println("El digito mayor esta en el numero 1.");
            }
        }

        if ((digito3 > digito5 && digito3 > digito6) || (digito4 > digito5 && digito4 > digito6)) {

            if ((digito3 > digito1 && digito3 > digito2) || (digito4 > digito1 && digito4 > digito2)) {
                System.out.println("El digito mayor esta en el numero 2.");
            }
        }

        if ((digito5 > digito1 && digito5 > digito2) || (digito6 > digito1 && digito6 > digito2)) {

            if ((digito5 > digito3 && digito5 > digito4) || (digito6 > digito3 && digito6 > digito4)) {
                System.out.println("El mayor digito esta en el numero 3.");
            }
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar si el primer dígito es igual al último.
     */
    public static void compararPimer_Y_UltimoNumero() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        if (numero > 0 && numero < 10) {
            System.out.println("Nos falta dos digitos");
        } else if (numero > 9 && numero < cien) {

            System.out.println("Nos falta un digito");

        } else if (numero > 99 && numero < mil) {
            int num1 = numero / cien;
            int num3 = numero % diez;

            if (num1 == num3) {
                System.out.println("El primer y ultimo digito son iguales.");
            } else {
                System.out.println("El primer y ultimo numero no son iguales.");
            }
        } else {
            System.out.println("El numero tiene mas de tres digitos.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar cuántos dígitos primos tiene.
     */
    public static void tresDigitosPrimos() {
        int acum1 = 0, acum2 = 0, acum3 = 0, cont = 0;
        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int num1 = numero / cien;
        int num2 = (numero / diez) % diez;
        int num3 = numero % diez;

        if (numero > 0 && numero < diez) {
            System.out.println("Nos falta dos digitos para el numero.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos falta un digito para el numero.");
        } else if (numero > 99 && numero < mil) {
            for (int i = 1; i <= 9; i++) {
                int residuo1 = num1 % i;
                int residuo2 = num2 % i;
                int residuo3 = num3 % i;

                if (residuo1 == 0) {
                    acum1++;
                }

                if (residuo2 == 0) {
                    acum2++;
                }

                if (residuo3 == 0) {
                    acum3++;
                }
            }

            if (acum1 == 2) {
                cont++;
            }

            if (acum2 == 2) {
                cont++;
            }
            if (acum3 == 2) {
                cont++;
            }

            System.out.println("EL total de numeros primos es: " + cont + ".");
        } else {
            System.out.println("Sobrepasamos los tres digitos necesarios.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar cuántos dígitos pares tiene.
     */
    public static void tresDigitosPares() {
        int cont = 0;
        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int num1 = numero / cien;
        int num2 = (numero / diez) % diez;
        int num3 = numero % diez;

        if (numero > 0 && numero < 10) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 99 && numero < mil) {
            if ((num1 % 2) == 0) {
                cont++;
            }

            if ((num2 % 2) == 0) {
                cont++;
            }

            if ((num3 % 2) == 0) {
                cont++;
            }

            System.out.println("El total de numeros pares es: " + cont + ".");
        } else {
            System.out.println("La cantidad de digitos es mayor a tres.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar si alguno de sus dígitos es igual a la suma de 
    los otros dos.
     */
    public static void comparacionSumaDigitos() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int num1 = numero / cien;
        int num2 = (numero / diez) % diez;
        int num3 = numero % diez;

        if (numero > 0 && numero < diez) {
            System.out.println("Faltan 2 digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Falta 1 digito.");
        } else if (numero > 99 && numero < mil) {

            if ((num1 + num2) == num3) {
                System.out.println("La suma del digito 1 y 2 es igual al digito 3.");
            }

            if ((num3 + num1) == num2) {
                System.out.println("La suma del digito 1 y 3 es igual al digito 2");
            }

            if ((num2 + num3) == num1) {
                System.out.println("La suma del digito 2 y 3 es igual al digito 1.");
            }

        } else {
            System.out.println("La cantidad de digitos requeridos fue superado.");
        }
    }

    /*
    Leer un número entero de cuatro dígitos y determinar a cuanto es igual la suma de sus dígitos.
     */
    public static void sumaCuatroDigitos() {

        System.out.print("Ingrese un numero entero(cuatro digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int dgt1 = numero / mil;
        int dgt2 = (numero / cien) % diez;
        int dgt3 = (numero / diez) % diez;
        int dgt4 = numero % diez;

        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan tres digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 99 && numero < mil) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 999 && numero < 10000) {

            int resultado = dgt1 + dgt2 + dgt3 + dgt4;
            System.out.println("El resultado es: " + resultado);

        } else {
            System.out.println("Se ha sobrepasado la cantidad de digitos requeridos.");
        }
    }

    /*
    Leer un número entero de cuatro dígitos y determinar cuántos dígitos pares tiene.
     */
    public static void comprobacionNumerosPares() {
        int acum = 0;
        System.out.print("Ingrese un numero entero(cuatro digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int dgt1 = numero / mil;
        int dgt2 = (numero / cien) % diez;
        int dgt3 = (numero / diez) % diez;
        int dgt4 = numero % diez;

//        System.out.println("digito1: " + dgt1);
//        System.out.println("digito2: " + dgt2);
//        System.out.println("digito3: " + dgt3);
//        System.out.println("digito4: " + dgt4);
        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan tres digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 99 && numero < mil) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 999 && numero < 10000) {

            if ((dgt1 % 2) == 0) {
                acum++;
            }
            if ((dgt2 % 2) == 0) {
                acum++;
            }
            if ((dgt3 % 2) == 0) {
                acum++;
            }
            if ((dgt4 % 2) == 0) {
                acum++;
            }

            System.out.println("La cantidad de numeros pares es: " + acum + ".");

        } else {
            System.out.println("Se ha sobrepasado la cantidad de digitos requeridos.");
        }
    }

    /*
    Leer un número entero menor que 50 y positivo y determinar si es un número primo.
     */
    public static void numMenor50Primo() {
        int acum = 0, cont = 0;
        System.out.print("Ingrese un numero(menor a 50): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 9 && numero < 51) {

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

        } else if (numero > 50 && numero < cien) {
            System.out.println("El numero ingresado es mayor a 50.");
        } else {
            System.out.println("El numero ingresado supera la cantidad de dos digitos requeridos.");
        }
    }

    /*
    Leer un número entero de cinco dígitos y determinar si es un número capicúo. Ej. 15651, 59895.
     */
    public static void numeroCapicuo() {
        System.out.print("Ingrese un numero de 5 digitos: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        int dgt1 = numero / 10000;
        int dgt2 = (numero / mil) % diez;
        int dgt3 = (numero / cien) % diez;
        int dgt4 = (numero / diez) % diez;
        int dgt5 = numero % diez;

//        System.out.println("digito1: " + dgt1);
//        System.out.println("digito2: " + dgt2);
//        System.out.println("digito3: " + dgt3);
//        System.out.println("digito4: " + dgt4);
//        System.out.println("digito1: " + dgt5);

        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan cuatro digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos faltan tres digitos.");
        } else if (numero > 99 && numero < mil) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 999 && numero < 10000) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 999 && numero < 100000) {

            if (dgt1 == dgt5 && dgt2 == dgt4) {
                System.out.println("El " + numero + " es un numero capicuo.");
            } else {
                System.out.println("El " + numero + " no es un numero capicuo.");
            }

        } else {
            System.out.println("La cantidad de digitos requeridos ha sido excedida.");
        }
    }

    /*
    Leer un número entero de cuatro dígitos y determinar si el segundo dígito es igual al penúltimo.
     */
    public static void segundo_y_PenultimoNum() {

        System.out.print("Ingrese un numero esntero(cuatro digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        int dgt2 = (numero / cien) % diez;
        int dgt3 = (numero / diez) % diez;

        if (numero > 0 && numero < diez) {
            System.out.println("Nos faltan tres digitos.");
        } else if (numero > 9 && numero < cien) {
            System.out.println("Nos faltan dos digitos.");
        } else if (numero > 99 && numero < mil) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 999 && numero < 10000) {

            if (dgt2 == dgt3) {
                System.out.println("El segundo y penultimo digitos del numero son iguales.");
            } else {
                System.out.println("El segundo y penultimo digitos del numero no son iguales.");
            }

        } else {
            System.out.println("La cantidad de digitos requeridos ha sido excedida.");
        }
    }
}
