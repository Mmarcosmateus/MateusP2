public class Exercicio04 { 

    public static int[] contarParesImpares(int[] numeros) {
        int[] resultado = new int[5]; 
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                resultado[0]++; 
            } else {
                resultado[1]++; 
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4};

        int[] r = contarParesImpares(lista);

        System.out.println("Pares: " + r[0]);
        System.out.println("Ímpares: " + r[1]);
    }
}
