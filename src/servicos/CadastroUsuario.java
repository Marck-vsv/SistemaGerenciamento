package servicos;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CadastroUsuario {
    Scanner input = new Scanner(System.in);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private final String CAMINHO = "C:\\usuariosSis\\";

    public void menuCadastroUsuario () throws IOException {
        System.out.println("SELECIONE O TIPO DE USUÁRIO");

        System.out.println("[1] Aluno");
        System.out.println("[2] Funcionário");
        System.out.println("[3] Sair");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
            case 2:
                cadastroNovoUsuario(opcao);
                break;
            case 3:
                System.out.println("FIM DO PROGRAMA");
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
                menuCadastroUsuario();
        }
    }

    public void cadastroNovoUsuario (int opcao) throws IOException {
        if (opcao == 1) {
            cadastroAluno();
        } else {
            System.out.println("\n------------------------------------");
            System.out.println("\n--     CADASTRO DE FUNCIONÁRIO    --");
            System.out.println("\n------------------------------------\n");

            System.out.println("SELECIONE O TIPO DE FUNCIONÁRIO: ");
            System.out.println("[1] Gerente");
            System.out.println("[2] Professor");
            
            int tipoFuncionario = input.nextInt();

            switch (tipoFuncionario) {
                case 1:
                    cadastroGerente();
                    break;
                case 2:
                    cadastroProfessor();
                    break;
                default:
                    System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                    cadastroNovoUsuario(opcao);
            }
        }
    }

    public void cadastroAluno() throws IOException {
        System.out.print("| Informe a sua matricula: ");
        String matricula = input.next();

        System.out.print("| Informe seu nome: ");
        String nome = reader.readLine();

        System.out.print("| Informe sua senha: ");
        String senha = input.next();

        String dadosAluno = matricula + ";" + nome + ";" + senha;

        salvarEmArquivo(dadosAluno, "aluno.txt");
    }

    public void cadastroGerente () throws IOException {
        System.out.print("| Informe a sua matricula: ");
        String matricula = input.next();

        System.out.print("| Informe seu nome: ");
        String nome = reader.readLine();

        System.out.print("| Informe sua senha: ");
        String senha = input.next();

        String dadosGerente = matricula + ";" + nome + ";" + senha;

        salvarEmArquivo(dadosGerente, "gerente.txt");
    }

    public void cadastroProfessor () throws IOException {
        System.out.print("| Informe a sua matricula: ");
        String matricula = input.next();

        System.out.print("| Informe seu nome: ");
        String nome = reader.readLine();

        System.out.print("| Informe sua senha: ");
        String senha = input.next();

        String dadosProfessor = matricula + ";" + nome + ";" + senha;

        salvarEmArquivo(dadosProfessor, "professor.txt");
    }

    public void salvarEmArquivo (String dados, String nomeArquivo) {
        try {
            // Abre o arquivo em modo de escrita
            FileWriter fileWriter = new FileWriter(CAMINHO + nomeArquivo, true);

            // Cria o BufferedWriter para escrever no arquivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escreve os valores no arquivo
            bufferedWriter.newLine();
            bufferedWriter.write(dados);

            // Fecha o BufferedWriter
            bufferedWriter.close();

            System.out.println("Valores escritos no arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
