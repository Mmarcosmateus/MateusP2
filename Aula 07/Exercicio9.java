import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senhaCorreta =" 488";
        String senha = "";

        while (true) {
            System.out.print("Digite a senha: ");
            senha = entrada.next();

            if (senha.equals(senhaCorreta)) {
                break;
            }

            System.out.println("Senha incorreta!");
        }

        System.out.println("Acesso liberado");

        entrada.close();
    }
}