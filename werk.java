public class VerificaNumeroPrimo {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 12;
        if (isPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}


public class Somatorio {
    public static int somar(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {13, 17};
        int resultado = somar(numeros);
        System.out.println("O somatório dos números é: " + resultado);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int primeiroTermo = 0;
        int segundoTermo = 1;
        System.out.print(primeiroTermo + " " + segundoTermo);
        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(" " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}


public class MaximoDivisorComum {
    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 22;
        int b = 12;
        int resultado = mdc(a, b);
        System.out.println("O máximo divisor comum entre " + a + " e " + b + " é: " + resultado);
    }
}


import java.util.Arrays;

public class Quicksort {
    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(array, inicio, fim);
            quicksort(array, inicio, pivo - 1);
            quicksort(array, pivo + 1, fim);
        }
    }

    public static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {15, 22, 13, 1989, 77};
        System.out.println("Array não ordenado: " + Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}


import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] conjunto = new int[10];

        System.out.print( "2 5 3 8 1 7 10 0 9 4");
        for (int i = 0; i < 10; i++) {
            conjunto[i] = sc.nextInt();
        }
        sc.close();

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (conjunto[i] >= 0 && conjunto[i] <= 10) {
                contador++;
            }
        }

        System.out.println("Existem " + contador + " valores inteiros entre 0 e 10 no conjunto de dados.");
    }
}
