package domain;

import com.sun.jmx.snmp.SnmpCounter64;
import java.util.Scanner;

public class Decision31_al_40 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer un número entero y determina si es igual a 10.
     */
    public static void igualDiez() {
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero == 10) {
            System.out.println("El numero ingresado es igual a 10.");
        } else {
            System.out.println("El numero ingresado no es igual a 10.");
        }
    }

    /*
    Leer un número entero y determinar si es múltiplo de 7.
     */
    public static void multiploSiete() {

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if ((numero % 7) == 0) {
            System.out.println("El " + numero + " es multiplo de siete.");
        } else {
            System.out.println("El " + numero + " no es multiplo de siete.");
        }

    }

    /*
    Leer un número entero y determinar si termina en 7.
     */
    public static void terminaSiete() {
        System.out.print("Ingresa un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < 10) {

            if (numero == 7) {
                System.out.println("El " + numero + " termina en siete.");
            } else {
                System.out.println("El " + numero + " no termina en siete.");
            }

        }

        if (numero > 9 && numero < 100) {

            int dgt2 = numero % diez;

            if (dgt2 == 7) {
                System.out.println("El " + numero + " termina en siete.");
            } else {
                System.out.println("El " + numero + " no termina en siete.");
            }

        }

        if (numero > 99 && numero < 1000) {

            int dgt3 = numero % diez;

            if (dgt3 == 7) {
                System.out.println("El " + numero + " termina en siete.");
            } else {
                System.out.println("El " + numero + " no termina en siete.");
            }

        }

        if (numero > 999 && numero < 10000) {

            int dgt4 = numero % diez;

            if (dgt4 == 7) {
                System.out.println("El " + numero + " termina en siete.");
            } else {
                System.out.println("El " + numero + " no termina en siete.");
            }

        }

    }

    /*
    Leer un número entero menor que mil y determinar cuántos dígitos tiene.
     */
    public static void cantDigitos() {
        System.out.print("Ingrese un numero entero menor a mil: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < 10) {

            System.out.println("El numero tiene un digito.");

        }

        if (numero > 9 && numero < 100) {

            System.out.println("El numero tiene dos digitos.");

        }

        if (numero > 99 && numero < 1000) {

            System.out.println("El numero tiene tres digitos.");

        }

        if (numero > 999) {
            System.out.println("El numero ingresado supera la cantidad pedida.");
        }
    }

    /*
    Leer un número entero de dos dígitos, guardar cada dígito en una variable diferente y luego mostrarlas 
    en pantalla.
     */
    public static void mostrarDosDigitos() {
        System.out.print("Ingrese un numero entero(dos digitos): ");
        int numero = entrada.nextInt();

        if (numero > 0 && numero < 10) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 9 && numero < 100) {

            int dgt1 = numero / diez;
            int dgt2 = numero % diez;

            System.out.println("Variable 1: " + dgt1);
            System.out.println("Variable 2: " + dgt2);
        } else {
            System.out.println("La cantidad de digitos necesarios ha sido superada.");
        }

    }

    /*
    Leer un número entero de 4 dígitos y determinar si tiene mas dígitos pares o impares.
     */
    public static void cuatroDigitosParImpar() {
        int contPar = 0, contImpar = 0;
        System.out.print("Ingrese un numero entero(cuatro digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
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
            if ((dgt1 % 2) == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            if ((dgt2 % 2) == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            if ((dgt3 % 2) == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            if ((dgt4 % 2) == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            System.out.println("contPar = " + contPar);
            System.out.println("contImpar = " + contImpar);

            if (contImpar == contPar) {
                System.out.println("La cantidad de numeros pares es igual a la cantidad de numeros impares.");
            } else if (contPar > contImpar) {
                System.out.println("Hay mas numeros pares en el numero ingresado.");
            } else {
                System.out.println("Hay mas numeros impares en el numero ingresado.");
            }

        } else {
            System.out.println("La cantidad de digitos necesarios ha sido superada.");
        }

    }

    /*
    Leer dos números enteros y determinar cuál es múltiplo de cuál.
     */
    public static void determinarMultiplo() {

        System.out.print("Ingrese un numero entero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese otro numero entero: ");
        int num2 = entrada.nextInt();

        if (num1 < 0) {
            num1 *= (-1);
        }
        if (num2 < 0) {
            num2 *= (-1);
        }

        int parte1 = num2 % num1;
        int parte2 = num1 % num2;

        if (parte1 == 0 || parte2 == 0) {
            System.out.println("Uno de los numeros es multiplo del otro.");
        } else {
            System.out.println("Ningun numero es multiplo del otro.");
        }

    }

    /*
    Leer tres números enteros y determinar si el último dígito de los tres números es igual.
     */
    public static void comprobarUltimoDigito() {

        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = entrada.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0 && num1 < diez && num2 < diez && num3 < diez) {

            if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("Los numero son iguales.");
            } else {
                System.out.println("Los ultimos digitos no son iguales.");
            }
        }

        int dgt2 = num1 % diez;
        int dgt4 = num2 % diez;
        int dgt6 = num3 % diez;

        if (num1 > 9 && num2 > 9 && num3 > 9 && num1 < cien && num2 < cien && num3 < cien) {

            if (dgt2 == dgt4 && dgt2 == dgt6 && dgt4 == dgt6) {
                System.out.println("Los ultimos digitos son iguales");
            } else {
                System.out.println("Los ultimos digitos no son iguales.");
            }

        }

        if (num1 > 99 && num2 > 99 && num3 > 99 && num1 < mil && num2 < mil && num3 < mil) {

            if (dgt2 == dgt4 && dgt2 == dgt6 && dgt4 == dgt6) {
                System.out.println("Los ultimos digitos son iguales");
            } else {
                System.out.println("Los ultimos digitos no son iguales.");
            }
        }

        if (num1 > 999 && num2 > 999 && num3 > 999 && num1 < 10000 && num2 < 10000 && num3 < 10000) {

            if (dgt2 == dgt4 && dgt2 == dgt6 && dgt4 == dgt6) {
                System.out.println("Los ultimos digitos son iguales");
            } else {
                System.out.println("Los ultimos digitos no son iguales.");
            }
        }
    }

    /*
    Leer tres números enteros y determina si el penúltimo dígito de los tres números es igual.
     */
    public static void comprobarPenultimoDigito() {

        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = entrada.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0 && num1 < diez && num2 < diez && num3 < diez) {

            System.out.println("Se necesita un digito mas para poder realizar el calculo.");
        }
        int dgt1, dgt3, dgt5;

        if (num1 > 9 && num2 > 9 && num3 > 9 && num1 < cien && num2 < cien && num3 < cien) {
            dgt1 = num1 / diez;
            dgt3 = num2 / diez;
            dgt5 = num3 / diez;

            if (dgt1 == dgt3 && dgt1 == dgt5 && dgt3 == dgt5) {
                System.out.println("Los penultimos digitos son iguales.");
            } else {
                System.out.println("Los penultimos digitos no son iguales.");
            }

        }

        dgt1 = (num1 / diez) % diez;
        dgt3 = (num2 / diez) % diez;
        dgt5 = (num3 / diez) % diez;

        if (num1 > 99 && num2 > 99 && num3 > 99 && num1 < mil && num2 < mil && num3 < mil) {

            if (dgt1 == dgt3 && dgt1 == dgt5 && dgt3 == dgt5) {
                System.out.println("Los penultimos digitos son iguales.");
            } else {
                System.out.println("Los penultimos digitos no son iguales.");
            }
        }

        if (num1 > 999 && num2 > 999 && num3 > 999 && num1 < 10000 && num2 < 10000 && num3 < 10000) {

            if (dgt1 == dgt3 && dgt1 == dgt5 && dgt3 == dgt5) {
                System.out.println("Los penultimos digitos son iguales.");
            } else {
                System.out.println("Los penultimos digitos no son iguales.");
            }
        }

        if (num1 > 9999 || num2 > 9999 || num3 > 9999) {
            System.out.println("La cantidad necesaria de digitos ha sido superada.");
        }
    }

    /*
    Leer dos números enteros y si la diferencia entre los dos es menor o igual a 10 
    entonces mostrar en pantalla todos los enteros comprendidos entre el menor y el 
    mayor de los números leídos.
     */
    public static void numeroDiferencia() {
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        int cont = 0, acum = 0;
        if (num2 > num1) {

            cont = num1;
            while (cont < num2) {
                acum++;
                cont++;
            }

            System.out.println("Entre: " + num1 + " y " + num2 + " existe una diferencia de: " + acum + " numeros.");
            cont = num1; //se le vuelve a asignar el num1 ya que el contador acumula los valores anteriores.
            if (acum <= 10) {
                System.out.println("Lista de numeros entre: " + num1 + " y " + num2 + ":");
                while (cont <= num2) {
                    System.out.print("-" + cont + "-");
                    cont++;
                }
                System.out.println("");

            } else {
                System.out.println("Hay una diferencia mayor a 10 entre los numeros ingresados.");
            }
        }

        if (num1 > num2) {

            cont = num2;
            while (cont < num1) {
                acum++;
                cont++;
            }

            System.out.println("Entre: " + num1 + " y " + num2 + " existe una diferencia de: " + acum + " numeros.");
            cont = num2; //se le vuelve a asignar el num1 ya que el contador acumula los valores anteriores.
            if (acum <= 10) {
                System.out.println("Lista de numeros entre: " + num2 + " y " + num1 + ":");
                while (cont <= num1) {
                    System.out.print("-" + cont + "-");
                    cont++;
                }
                System.out.println("");

            } else {
                System.out.println("Hay una diferencia mayor a 10 entre los numeros ingresados.");
            }
        }

    }
}
