public class Exercicio03{ 

    // método que verifica se a string existe no array
    public static boolean elementoExiste(String[] lista, String busca) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(busca)) {
                return true; // achou
            }
        }

        return false; // não achou
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "João", "Maria"};

        boolean resultado = elementoExiste(nomes, "João");

        System.out.println("Existe? " + resultado);
    }
}