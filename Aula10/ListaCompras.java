import java.util.Scanner;
import java.util.ArrayList;

public class ListaCompras {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do{

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");

            opcao = ler.nextInt();
            ler.nextLine();

            if(opcao == 1){

                System.out.println("Digite o item:");
                String item = ler.nextLine();

                lista.add(item);

                System.out.println("Item adicionado!");
            }

            else if(opcao == 2){

                System.out.println("\nLista de compras:");

                for(int i = 0; i < lista.size(); i++){

                    System.out.println(i + " - " + lista.get(i));
                }
            }

            else if(opcao == 3){

                System.out.println("Digite o índice para remover:");
                int indice = ler.nextInt();

                if(indice >= 0 && indice < lista.size()){

                    lista.remove(indice);

                    System.out.println("Item removido!");
                }

                else{
                    System.out.println("Índice inválido!");
                }
            }

            else if(opcao == 4){

                System.out.println("Programa encerrado.");
            }

            else{
                System.out.println("Opção inválida!");
            }

        }while(opcao != 4);

        ler.close();
    }
}