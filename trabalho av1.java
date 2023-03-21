

public static boolean isPrime(int num) {
  if (num <= 1) return false; // Verifica se o número é menor ou igual a 1 (não é primo)
  for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
      return false; // Se houver um divisor além de 1 e do próprio número, ele não é primo
    }
  }
  return true; // Se não houver nenhum divisor além de 1 e do próprio número, ele é primo
}

public static int sum(int[] arr) {
  int total = 0;
  for (int i = 0; i < arr.length; i++) {
    total += arr[i];
  }
  return total;
}

public static int[] fibonacci(int n) {
  if (n <= 0) return new int[0];
  if (n == 1) return new int[]{0};
  if (n == 2) return new int[]{0, 1};

public static int mdc(int a, int b) {
  if (b == 0) return a;
  return mdc(b, a % b);
}
