import java.util.Scanner;
import static java.lang.System.out;

public class Ficha2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        out.print("Exercicio: ");
        int ex = scan.nextInt();

        switch (ex) {
            case 1:
                // inicializar o array
                Array array = new Array();

                out.print("Alinea: ");
                String alinea1 = scan.next();
                out.print("Numero de inteiros que quer introduzir: ");
                int numeroDeInteiros = scan.nextInt();
                switch (alinea1) {
                    case "a":
                        int min = array.lerDevolverMinimo(numeroDeInteiros);
                        out.print("min: " + min);
                        break;
                    case "b":
                        array.lerDevolverEntreIndices(numeroDeInteiros);
                        break;
                    case "c":
                        int[] comuns = new int[numeroDeInteiros];
                        array.comumAosDois(numeroDeInteiros, comuns);
                        break;
                }
                break;
            case 2:
                Turma turma = new Turma(5,5);
                out.print("Alinea: ");
                String alinea2 = scan.next();

                // 2. a)
                // preencho a matriz fora do switch para poder utiliza-la nas
                // alíneas seguintes.
                int i,j;
                out.println("Vamos preencher a matriz das notas");
                for(i=0; i<5; i+=1) {
                    for (j=0; j < 5; j += 1) {
                        out.println("Aluno " + i);
                        out.println("Uc " + j);
                        out.print("Nota: ");
                        int nota = scan.nextInt();
                        turma.atualizarPauta(i, j, nota);
                    }
                }

                switch (alinea2){
                    case "b":
                        out.print("Indice da Uc: ");
                        int indiceUc = scan.nextInt();
                        int somaNotas = turma.somaNotas(indiceUc);
                        out.println("A soma das notas desta Uc e " + somaNotas);
                        break;

                    case "c":
                        out.print("Indice do aluno: ");
                        int indiceAluno = scan.nextInt();
                        float mediaNotasAluno = turma.mediaDoAluno(indiceAluno);
                        out.println("A media deste aluno e " + mediaNotasAluno);
                        break;

                    case "d":
                        out.print("Insira o indice da Uc: ");
                        int ucIndex = scan.nextInt();
                        float mediaNotasUc = turma.mediaDaUc(ucIndex);
                        out.println("A media desta uc e " + mediaNotasUc);
                        break;

                    case "e":
                        int notaMaisAlta = turma.notaMaisAlta();
                        out.println("A nota mais alta da turma e " + notaMaisAlta);
                        break;
                    case "f":
                        int notaMaisBaixa = turma.notaMaisBaixa();
                        out.println("A nota mais baixa da turma e " + notaMaisBaixa);
                        break;
                    case "g":
                        out.println("Insira um numero inteiro: ");
                        int valor = scan.nextInt();
                        turma.notasAcimaDe(valor);
                        break;
                    case "h":
                        out.println("Notas de todos os alunos do curso");
                        turma.notasDosAlunos();
                        break;
                    case "i":
                        out.println("Indice da Uc com maior media: " + turma.mediaUcMaisAlta());
                        break;
                    default:
                        out.println("Alinea inexistente");
                        break;
                }
                break;

        }

    }

}
