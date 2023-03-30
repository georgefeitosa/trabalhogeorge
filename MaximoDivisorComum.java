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