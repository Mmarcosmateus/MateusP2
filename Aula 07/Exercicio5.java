public class Exercicio5 {
    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 10, 9};

        int soma = 0;

        // somando as notas
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }

        double media = soma / 5.0;

        int contador = 0;

        // verificando quem está acima da média
        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                contador++;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Acima da media: " + contador);
    }
}