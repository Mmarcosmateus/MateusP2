public class exer01 {

    static class aluno { 
        String nome;
        String matricula;
        double nota1;
        double nota2;
        double nota3;

        public aluno(String nome, String matricula, double nota1, double nota2, double nota3) { 
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double calcularmedia() { 
            return (nota1 + nota2 + nota3) / 3;
        }

        public void verificarSituacao() { 
            double media = calcularmedia();

            if (media >= 7) {
                System.out.println(nome + " - Aprovado");
            } else { 
                System.out.println(nome + " - Reprovado");
            }
        }
    }

    public static void main(String[] args) {

        aluno aluno1 = new aluno("Marcos", "123", 8.0, 7.5, 9.0);
        aluno aluno2 = new aluno("Beatriz", "456", 5.0, 6.0, 4.0);

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}
    



