public class Recursao {
   
   
    public static int calcularFatorial(int n) {
        // Fatorial de 0 ou 1 é igual a 1
        if (n==0 || n==1) {
            return 1;
        } else{
            // Recursão
            return n * calcularFatorial(n - 1);
        }
    }
}

