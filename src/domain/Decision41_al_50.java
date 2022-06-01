package domain;

import java.util.Scanner;

public class Decision41_al_50 {

    static Scanner entrada = new Scanner(System.in);
    public static final int diez = 10;
    public static final int cien = 100;
    public static final int mil = 1000;

    /*
    Leer dos números enteros y determinar si la diferencia entre los dos es un número primo.
     */
    public static void numDiferenciaPrimo() {
        int acum = 0, residuo;
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        int cont = 0, pPrimo = 0, aux;

//      En caso de que el numero 1 sea mayor que el numero 2 se cambia el orden,
//       esto es para no copiar dos veces el mismo codigo.   
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        cont = num1 + 1;
        while (cont < num2) {
            pPrimo++;
            cont++;
        }

        for (int i = 1; i <= pPrimo; i++) {
            residuo = pPrimo % i;
            if (residuo == 0) {
                acum++;
            }
        }

        if (acum == 2) {
            System.out.println("La diferencia entre los dos numeros, da un numero primo.");
        } else {
            System.out.println("La diferencia entre los dos numeros, no da un numero primo.");
        }
    }

    /*
    Leer dos números enteros y determinar si la diferencia entre los dos es un número par.
     */
    public static void numDiferenciaPar() {
        int cont = 0, pPar = 0, aux;
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        cont = num1 + 1;
        while (cont < num2) {
            pPar++;
            cont++;
        }

        if ((pPar % 2) == 0) {
            System.out.println("La diferencia entre los dos numeros, da un numero par.");
        } else {
            System.out.println("La diferencia entre los dos numeros, no da un numero par.");
        }
    }

    /*
     Leer dos números enteros y determinar si la diferencia entre los dos es un 
     número divisor exacto de alguno de los dos números.
     */
    public static void numDivisorExacto() {
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        int res = num1 - num2;

        if (res < 0) {
            res *= (-1);
        }

        if (res == 0) {
            System.out.println("No se puede efectuar la operacion, ya que la diferencia da 0.");
        } else {

            if (((num1 % res) == 0) || ((num2 % res) == 0)) {
                System.out.println("La diferencia de los dos numeros genero un divisor"
                        + " exacto en uno de los numeros ingresados.");
            } else {
                System.out.println("La diferencia de los dos numeros no genero un divisor"
                        + " exacto en ninguno de los numeros ingresados.");
            }
        }
    }

    /*
    Leer un número entero de 4 dígitos y determinar si el primer dígito es múltiplo 
    de alguno de los otros dígitos.
     */
    public static void primerDigitoMultiplo() {
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

            if (((dgt2 % dgt1) == 0) || ((dgt3 % dgt1) == 0) || ((dgt4 % dgt1) == 0)) {
                System.out.println("El primer digito es multiplo de alguno de los otros dígitos.");
            } else {
                System.out.println("El primer digito no es multiplo de alguno de los otros dígitos.");
            }

        }
    }

    /*
    Leer un número entero de 2 dígitos y si es par mostrar en pantalla la suma de sus 
    dígitos, si es primo y menor que 10 mostrar en pantalla su último dígito y si es 
    múltiplo de 5 y menor que 30 mostrar en pantalla el primer dígito.
     */
    public static void numValidaciones() {
        int cont = 0, acum = 0;
        System.out.print("Ingrese un numero entero(dos digitos):");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        int dgt1;
        int dgt2;
        if ((numero % 2) == 0) {
            dgt1 = numero / diez;
            dgt2 = numero % diez;
            int resultado = dgt1 + dgt2;
            System.out.println("El numero es par, se muestra la suma de sus digitos: " + resultado);
        }

        //para la parte del primo
        for (int i = 1; i <= numero; i++) {
            int residuo = numero % i;
            if (residuo == 0) {
                acum++;
            }
        }

        boolean bandera;
        if (acum == 2) {
            bandera = true;
        } else {
            bandera = false;
        }

        if (bandera && (numero > 9 && numero < 99)) {
            dgt2 = numero % diez;
            System.out.println("El numero es primo y su ultimo digito es: " + dgt2);
        }

        if (((numero % 5) == 0) && numero < 30) {
            dgt1 = numero / diez;
            System.out.println("El numero es multiplo de 5 y menor que 30, su primer digito es: " + dgt1);
        }
    }

    /*
    Leer un número entero de 2 dígitos y si termina en 1 mostrar en pantalla su primer 
    dígito, si termina en 2 mostrar en pantalla la suma de sus dígitos y si termina en 
    3 mostrar en pantalla el producto de sus dos dígitos.
     */
    public static void numValidaciones2() {
        System.out.print("Ingrese un numero entero(dos digitos):");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        int dgt1 = numero / diez;
        int dgt2 = numero % diez;

        if (numero > 0 && numero < diez) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 9 && numero < cien) {
            if (dgt2 == 1) {
                System.out.println("Termina en uno, su primer digito es: " + dgt1 + ".");
            } else if (dgt2 == 2) {
                System.out.println("La suma de sus digitos es: " + (dgt1 + dgt2) + ".");
            } else if (dgt2 == 3) {
                System.out.println("El productos de sus digitos es: " + (dgt1 * dgt2) + ".");
            } else {
                System.out.println("No hay instrucciones para el resto de posibles resultados.");
            }
        } else if (numero > 99) {
            System.out.println("La cantidad de digitos necesarios ha sido superada.");
        }
    }

    /*
    Leer dos números enteros y si la diferencia entre los dos números es par mostrar en 
    pantalla la suma de los dígitos de los números, si dicha diferencia es un número primo
    menor que 10 entonces mostrar en pantalla el producto de los dos números y si la 
    diferencia entre ellos terminar en 4 mostrar en pantalla todos los dígitos por separado.
     */
    public static void numValidaciones3() {
        int dgt1, dgt2, dgt3, dgt4, dgt5, dgt6, acum = 0;
        System.out.print("Ingrese un numero entero:");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese un numero entero:");
        int numero2 = entrada.nextInt();

        if (numero1 < 0) {
            numero1 *= (-1);
        }
        if (numero2 < 0) {
            numero2 *= (-1);
        }
        int res = numero1 - numero2, res2;

        if (numero1 > 0 && numero2 > 0 && numero1 < diez && numero2 < diez) {

            if ((res % 2) == 0) {
                System.out.println("La suma de los numeros es: " + (numero1 + numero2));
            }

            //Para el numero primo
            for (int i = 1; i <= res; i++) {
                int residuo = res % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2 && res < diez) {
                System.out.println("El producto de los numeros es: " + (numero1 * numero2));
            }

            if (res == 4) {
                System.out.println("Variable 1: " + numero1);
                System.out.println("Variable 2: " + numero2);
            }

        }
        if (numero1 > 9 && numero2 > 9 && numero1 < cien && numero2 < cien) {

            dgt1 = numero1 / diez;
            dgt2 = numero1 % diez;
            dgt3 = numero2 / diez;
            dgt4 = numero2 % diez;

            if ((res % 2) == 0) {
                res2 = dgt1 + dgt2 + dgt3 + dgt4;
                System.out.println("La suma de los digitos de los dos numeros es: " + res2);
            }

            //Para el numero primo
            for (int i = 1; i <= res; i++) {
                int residuo = res % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2 && res < diez) {
                System.out.println("El producto de los numeros es: " + (numero1 * numero2));
            }

            //Si temrina en 4
            if (res == 4) {
                System.out.println("Se muestran los digitos de los dos numeros.");
                System.out.println(dgt1 + "," + dgt2 + "," + dgt3 + "," + dgt4 + ".");
            }

        }
        if (numero1 > 99 && numero2 > 99 && numero1 < mil && numero2 < mil) {

            dgt1 = numero1 / cien;
            dgt2 = (numero1 / diez) % diez;
            dgt3 = numero1 % diez;
            dgt4 = numero2 / cien;
            dgt5 = (numero2 / diez) % diez;
            dgt6 = numero2 % diez;

            if ((res % 2) == 0) {
                res2 = dgt1 + dgt2 + dgt3 + dgt4 + dgt5 + dgt6;
                System.out.println("La suma de los digitos de los dos numeros es: " + res2);

            }

            //Para el numero primo
            for (int i = 1; i <= res; i++) {
                int residuo = res % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2 && res < diez) {
                System.out.println("El producto de los numeros es: " + (numero1 * numero2));
            }

            //Si temrina en 4
            if (res == 4) {
                System.out.println("Se muestran los digitos de los dos numeros.");
                System.out.println(dgt1 + "," + dgt2 + "," + dgt3 + "," + dgt4 + ","
                        + dgt5 + "," + dgt6 + ".");
            }

        }

    }

    /*
    Leer un número entero y si es menor que 100 determinar si es primo.
     */
    public static void menorPrimoCien() {
        int acum = 0;
        System.out.print("Ingrese un numero entero:");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero < cien) {

            for (int i = 1; i <= numero; i++) {
                int residuo = numero % i;
                if (residuo == 0) {
                    acum++;
                }
            }

            //Si el acumulador vale dos es por que el numero es primo.
            if (acum == 2) {
                System.out.println("El " + numero + " es primo.");
            } else {
                System.out.println("El " + numero + " no es primo.");
            }

        } else {
            System.out.println("El numero es mayor a cien.");
        }
    }

    /*
    Leer un número entero y si es múltiplo de 4, determinar si su último dígito es primo.
     */
    public static void multiploCuatro() {
        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        int dgt2, acum = 0;
        if (numero > 0 && numero < diez) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 9 && numero < cien) {

            if ((numero % 4) == 0) {

                dgt2 = numero % diez;
                for (int i = 1; i <= dgt2; i++) {
                    int residuo = dgt2 % i;
                    if (residuo == 0) {
                        acum++;
                    }
                }

                if (acum == 2) {
                    System.out.println("El ultimo digito del numero es primo.");
                } else {
                    System.out.println("El ultimo digito del numero no es primo.");
                }
            }
        } else if (numero > 99 && numero < mil) {

            if ((numero % 4) == 0) {

                dgt2 = (numero / diez) % diez;
                for (int i = 1; i <= dgt2; i++) {
                    int residuo = dgt2 % i;
                    if (residuo == 0) {
                        acum++;
                    }
                }

                if (acum == 2) {
                    System.out.println("El ultimo digito del numero es primo.");
                } else {
                    System.out.println("El ultimo digito del numero no es primo.");
                }
            }
        } else {
            System.out.println("El cantidad de digitos necesarios ha sido superada.");
        }
    }

    /*
    Leer un número entero y si es múltiplo de 4 mostrar en pantalla su mitad, si es 
    múltiplo de 5 mostrar en pantalla su cuadrado y si es múltiplo de 6 mostrar en 
    pantalla su primer dígito. Asumir que el número no es mayor que 100.
     */
    public static void numValidaciones4() {

        System.out.print("Ingrese un numero entero(dos digitos): ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            numero *= (-1);
        }

        if (numero > 0 && numero < diez) {
            System.out.println("Nos falta un digito.");
        } else if (numero > 9 && numero < cien) {

            if ((numero % 4) == 0) {
                System.out.println("La mitad del numero es: " + (numero / 2));
            } else if ((numero % 5) == 0) {
                System.out.println("El cuadrado del numero es: " + (numero * numero));
            } else if ((numero % 6) == 0) {
                System.out.println("El primer digito del numero es: " + (numero / diez));
            }

        } else {
            System.out.println("El numero necesario ha sido superado.");
        }
    }

}
