public class Exercicio03{ 

   
    public static boolean elementoExiste(String[] lista, String busca) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(busca)) {
                return true;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "João", "Maria"};

        boolean resultado = elementoExiste(nomes, "João");

        System.out.println("Existe? " + resultado);
    }
}
