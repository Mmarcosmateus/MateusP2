public class Exercicio02 {

   
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; 
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] lista = {3, 7, 2, 9, 5};

        int maiorNumero = encontrarMaior(lista);

        System.out.println("Maior número: " + maiorNumero);
    }
}
