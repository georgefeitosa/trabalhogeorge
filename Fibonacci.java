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
