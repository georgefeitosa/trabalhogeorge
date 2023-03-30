
public class Contagem {

    public static void main(String[] args) {
        int[] conjunto = {2, (int)1.1, 3, (int)4.5, 6};

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (conjunto[i] % 1 == 0) {
                contador++;
            }
        }

        System.out.println("Existem " + contador + " valores inteiros no conjunto de dados.");
    }

    private static double lerNumero(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 1.1;
            case 2:
                return 3;
            case 3:
                return 4.5;
            case 4:
                return 6;
            default:
                throw new IndexOutOfBoundsException("Posição inválida no conjunto.");
        }
    }
}
