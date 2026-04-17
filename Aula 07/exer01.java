import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade do cidadão: ");
        int idadeUsuario = entrada.nextInt();

        if (idadeUsuario < 16) {
            System.out.println("Não pode votar.");
        } else if (idadeUsuario >= 18 && idadeUsuario <= 70) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto opcional.");
        }
        entrada.close();
    }
}