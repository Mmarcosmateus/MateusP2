import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
      
       System.out.print("Digite seu nome: ");
       String nome1= entrada.nextLine();
       


       System.out.print("Digite o nome do seu pai: ");
       String nome2= entrada.nextLine();
       
       
       if (nome1.equalsIgnoreCase(nome2)) {
        System.out.print("Os nomes são iguais");
     }

       else {
        System.out.print("Os nomes são diferente");

        }


        entrada.close();


      }
 }