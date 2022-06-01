package domain;

import java.util.Scanner;

public class Decision11_al_20 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;

    /*
    Leer dos números enteros y determinar cuál es el mayor.
     */
    public static void numeroMayor() {
        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
        }

        if (numero1 > numero2) {
            System.out.println("El numero 1 es mayor a numero 2.");
        } else if (numero2 > numero1) {
            System.out.println("El numero 2 es mayor a numero 1.");
        }
    }

    /*
    Leer dos números enteros de dos dígitos y determinar si tienen dígitos comunes.
     */
    public static void verificarDigitos() {

        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
        }

        int digito1 = numero1 / diez;
        int digito2 = numero1 % diez;
        int digito3 = numero2 / diez;
        int digito4 = numero2 % diez;

        if ((numero2 > 9 && numero2 < 99) && (numero2 > 9 && numero2 < 99)) {

            if (digito1 == digito3 || digito1 == digito4) {
                System.out.println("El digito 1 es igual al digito 3 o 4.");
            }
            if (digito2 == digito3 || digito2 == digito4) {
                System.out.println("El digito 2 es igual al digito 3 o 4.");
            }
            if (digito1 != digito3 || digito1 != digito4) {
                System.out.println("El digito 1 es diferente al digito 3 o 4.");
            }
            if (digito2 != digito3 || digito2 != digito4) {
                System.out.println("El digito 2 es diferente al digito 3 o 4.");
            }

        }
    }

    /*
    Leer dos números enteros de dos dígitos y determinar si la suma de los dos números origina un número par.
     */
    public static void sumaDigitosPar() {
        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
        }

        int resultado = numero1 + numero2;

        if ((resultado % 2) == 0) {
            System.out.println("La suma de los dos numeros ha dado un numero par: " + resultado);
        } else {
            System.out.println("La suma de los numeros no ha dado un numero par: " + resultado);
        }
    }

    /*
    Leer dos números enteros de dos dígitos y determinar a cuánto es igual la suma de todos los dígitos.
     */
    public static void sumaNumeros() {
        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
        }

        if ((numero1 > 9 && numero1 < 100) && (numero2 > 9 && numero2 < 100)) {
            int digito1 = numero1 / diez;
            int digito2 = numero1 % diez;
            int digito3 = numero2 / diez;
            int digito4 = numero2 % diez;

            int resultado = digito1 + digito2 + digito3 + digito4;
            System.out.println("El resultado de la suma es: " + resultado + ".");
        } else {
            System.out.println("Uno de los numeros contiene mas de dos digitos.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.
     */
    public static void sumaTresDigitos() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("El numero contiene un digito, nos faltan dos digitos.");
        } else if (numero > 9 && numero < 100) {
            System.out.println("El numero contiene dos digitos, nos falta un digito.");
        } else if (numero > 99 && numero < 1000) {

            int parte1 = numero / 100;
//            System.out.println("parte1 = " + parte1);

            int parte2 = (numero / diez) % diez;
//            System.out.println("parte2 = " + parte2);

            int parte3 = numero % diez;
//            System.out.println("parte3 = " + parte3);

            int resultado = parte1 + parte2 + parte3;
            System.out.println("El resultado es: " + resultado + ".");
        } else {
            System.out.println("El numero ingresado contiene mas de tres digitos.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar si al menos dos de sus tres dígitos son iguales.
     */
    public static void compararTresDigitos() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        int parte1 = numero / 100;

        int parte2 = (numero / diez) % diez;

        int parte3 = numero % diez;

        if (parte1 == parte2 || parte1 == parte3 || parte2 == parte3) {
            System.out.println("Al menos dos de los digitos del numero son iguales.");
        } else {
            System.out.println("Ninguno de los digitos del numero son iguales.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar en qué posición está el mayor dígito.
     */
    public static void numeroMayorTresDigitos() {
        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("El numero contiene un digito, nos faltan dos digitos.");
        } else if (numero > 9 && numero < 100) {
            System.out.println("El numero contiene dos digitos, nos falta un digito.");
        } else if (numero > 99 && numero < 1000) {

            int num1 = numero / 100;
            int num2 = (numero / diez) % diez;
            int num3 = numero % diez;

            if (num1 > num2 && num1 > num3) {
                System.out.println("El numero mas grande esta en la posicion 0.");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El numero mas grande esta en la posicion 1.");
            } else if (num3 > num1 && numero > num2) {
                System.out.println("El numero mas grande esta en la posicion 2.");
            }
        } else {
            System.out.println("Se ha ingresado un numero mayor a 3 digitos.");
        }
    }

    /*
    Leer un número entero de tres dígitos y determinar si algún dígito es múltiplo de los otros.
     */
    public static void compararTresDigitosMultiplo() {

        System.out.print("Ingrese un numero entero(tres digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero = numero * (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("El numero contiene un digito, nos faltan dos digitos.");
        } else if (numero > 9 && numero < 100) {
            System.out.println("El numero contiene dos digitos, nos falta un digito.");
        } else if (numero > 99 && numero < 1000) {

            int num1 = numero / 100;
            int num2 = (numero / diez) % diez;
            int num3 = numero % diez;

            int prueba1 = num1 % num2;
            int prueba2 = num2 % num1;
            int prueba3 = num1 % num3;
            int prueba4 = num3 % num1;
            int prueba5 = num2 % num3;
            int prueba6 = num3 % num2;

            if (prueba1 == 0 || prueba2 == 0 || prueba3 == 0 || prueba4 == 0 || prueba5 == 0 || prueba6 == 0) {
                System.out.println("Algun digito es multiplo de otro digito.");
            } else {
                System.out.println("Ningun digito es multiplo de otro digito.");
            }

        } else {
            System.out.println("El numero ingresado contiene mas de tres digitos.");
        }
    }

    /*
    Leer tres números enteros y determinar cuál es el mayor. Usar solamente dos variables.
     */
    public static void numMayor2Variables() {
        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
        }

        if (numero1 > numero2) {
            numero2 = 0;
            System.out.print("Ingrese un numero entero mas: ");
            numero2 = entrada.nextInt();

            if (numero2 < 0) {
                numero2 = numero2 * (-1);
            }

            if (numero1 > numero2) {
                System.out.println("El numero mayor es: " + numero1);
            } else {
                System.out.println("El numero mayor es: " + numero2);
            }

        } else if (numero2 > numero1) {
            numero1 = 0;
            System.out.print("Ingrese un numero entero mas: ");
            numero1 = entrada.nextInt();

            if (numero1 < 0) {
                numero1 = numero1 * (-1);
            }

            if (numero1 > numero2) {
                System.out.println("El numero mayor es: " + numero1);
            } else {
                System.out.println("El numero mayor es: " + numero2);
            }
        }
    }

    public static void mostrarTresDigitosAscendentes() {
        System.out.print("Ingrese un numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = entrada.nextInt();
        System.out.print("Ingrese un numero entero mas: ");
        int numero3 = entrada.nextInt();

        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            numero1 = numero1 * (-1);
            numero2 = numero2 * (-1);
            numero3 = numero3 * (-1);
        }

        if (numero1 < numero2 && numero2 < numero3 && numero3 > numero1) {
            System.out.println(numero1 + "," + numero2 + "," + numero3);
        } else if (numero1 < numero3 && numero3 < numero2 && numero2 > numero1) {
            System.out.println(numero1 + "," + numero3 + "," + numero2);
        } else if (numero2 < numero1 && numero1 < numero3 & numero3 > numero2) {
            System.out.println(numero2 + "," + numero1 + "," + numero3);
        } else if (numero2 < numero3 && numero3 < numero1 && numero1 > numero2) {
            System.out.println(numero2 + "," + numero3 + "," + numero1);
        } else if (numero3 < numero1 && numero1 < numero2 && numero2 > numero3) {
            System.out.println(numero3 + "," + numero1 + "," + numero2);
        } else if (numero3 < numero2 && numero2 < numero1 && numero1 > numero3) {
            System.out.println(numero3 + "," + numero2 + "," + numero1);
        }
    }
}
