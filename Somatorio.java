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
