public class Exercicio6 {
    public static void main(String[] args) {

        String[] nomes = {"Carlos", "Sabrina", "Mateus", "Lucas", "Ivoneide"};

        for (int i = 0; i < 5; i++) {

            String nome = nomes[i];

            if (nome.charAt(0) == 'A') {
                System.out.println("Nome encontrado: " + nome);
            }
        }
    }
}