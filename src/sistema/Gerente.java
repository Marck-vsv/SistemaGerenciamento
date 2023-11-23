package sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import interacoes.*;

public class Gerente extends Funcionario {
    public static final String CAMINHO = "C:\\usuariosSis\\";

    static Scanner input = new Scanner(System.in);

    public static void gerenteSistema() throws IOException {
        System.out.println("---------------------------------------------");
        System.out.println("Bem vindo Gerente, o que deseja fazer?");
        System.out.println("[1] Ver Funcionarios");
        System.out.println("[2] Contratar Funcionário");
        System.out.println("[3] Demitir Funcionário");
        System.out.println("[4] Aumentar ou Diminuir Salário");
        System.out.println("[5] Voltar");
        System.out.println("---------------------------------------------");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                verFuncionarios();
                break;
            case 2:
                contratarFuncionario();
                break;
            case 3:
                demitirFuncionario();
                break;
            case 4:
                aumentarOuDiminuirSal();
                break;
            case 5:
                MenuSistema.menuSistema();
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                gerenteSistema();
        }
    }

    public static void verFuncionarios() throws IOException {

        List<String> nomesArquivos = List.of(CAMINHO + "professor.txt", CAMINHO + "outros.txt", CAMINHO + "gerente.txt");
        
        int opcao = 1;
        
        System.out.println("\n[0] Voltar");
        
        for (String nomeArquivo : nomesArquivos) {
            try {
                List<String> linhas = Files.readAllLines(Path.of(nomeArquivo));
                for (int i = 1; i < linhas.size(); i++) {
                    String linha = linhas.get(i);
                    String[] colunas = linha.split(";");
                    System.out.print("[" + opcao + "] ");
                    System.out.print(colunas[0] + " ");
                    for (int j = 1; j < colunas.length; j++) {
                        if (j != 2) {
                            System.out.print(colunas[j] + " ");
                        }
                    }
                    System.out.println();
                    opcao++;
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo " + nomeArquivo + ": " + e.getMessage());
            }
        }
        
        int opcaoSelecionada = input.nextInt();

        if (opcaoSelecionada == 0) {
            gerenteSistema();
        } else {
            System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
            verFuncionarios();
        }
    }

    public static void contratarFuncionario() throws IOException {
        System.out.println("Selecione o tipo de funcionario que gostaria de contratar: ");
        System.out.println("[1] Professor");
        System.out.println("[2] Demais funcionarios");

        int opcao = input.nextInt();
        input.nextLine();

        switch (opcao) {
            case 1:
                contratarProf();
                gerenteSistema();
                break;
            case 2:
                contratarOutros();
                gerenteSistema();
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                contratarFuncionario();
        }
    }

    public static void contratarProf() throws IOException {
        System.out.println("Qual a matricula do professor alvo? ");
        String matricula = input.nextLine();

        System.out.println("Qual o nome do professor alvo? ");
        String nome = input.nextLine();

        System.out.println("Você contratou o professor " + nome + " com a matricula " + matricula);
    }

    public static void contratarOutros() throws IOException {
        System.out.println("Qual a matricula do funcionario alvo? ");
        String matricula = input.nextLine();

        System.out.println("Qual o nome do funcionario alvo? ");
        String nome = input.nextLine();

        System.out.println("Você contratou o funcionario " + nome + " com a matricula " + matricula);
    }

    public static void demitirFuncionario() throws IOException {
        System.out.println("Selecione o tipo de funcionario que gostaria de demitir: ");
        System.out.println("[1] Professor");
        System.out.println("[2] Demais funcionarios");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                demitirProf();
                gerenteSistema();
                break;
            case 2:
                demitirOutros();
                gerenteSistema();
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                demitirFuncionario();
        }
    }

    public static void demitirProf() throws IOException {
        System.out.println("Qual a matricula do professor alvo? ");
        String matricula = input.next();

        System.out.println("Qual o nome do professor alvo? ");
        String nome = input.next();

        System.out.println("Você demitiu o professor " + nome + " com a matricula " + matricula);
    }

    public static void demitirOutros() throws IOException {
        System.out.println("Qual a matricula do funcionario alvo? ");
        String matricula = input.nextLine();

        System.out.println("Qual o nome do funcionario alvo? ");
        String nome = input.nextLine();

        System.out.println("Você demitiu o funcionario " + nome + " com a matricula " + matricula);
    }

    public static void aumentarOuDiminuirSal() throws IOException {
        System.out.println("Selecione o tipo de funcionario que gostaria de modificar: ");
        System.out.println("[1] Professor");
        System.out.println("[2] Demais funcionarios");

        int opcao = input.nextInt();
        input.nextLine();

        switch (opcao) {
            case 1:
                salarioProf();
                break;
            case 2:
                salarioOutros();
                gerenteSistema();
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                aumentarOuDiminuirSal();
        }
    }

    public static void salarioProf() throws IOException {
        System.out.println("Qual a matricula do professor alvo? ");
        String matricula = input.nextLine();

        BufferedReader reader = Files.newBufferedReader(Path.of(CAMINHO + "professor.txt"));

        BufferedWriter writer = Files.newBufferedWriter(Path.of(CAMINHO + "professor.txt"));

        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] colunas = linha.split(";");
            if (colunas[0].equals(matricula)) {
                System.out.println("Qual o novo salario? ");
                String novoSalario = input.nextLine();

                linha = linha.replace(";" + colunas[3], ";" + String.valueOf(novoSalario));
            } else {
                System.out.println("Matricula inexistente");
                salarioProf();
            }

            writer.write(linha + "\n");
        }

        reader.close();
        writer.close();

        System.out.println("Salário de João atualizado em 15% com sucesso");
        gerenteSistema();
    }

    public static void salarioOutros() throws IOException {
        System.out.println("Qual a matricula do funcionario alvo? ");
        String matricula = input.nextLine();

        BufferedReader reader = Files.newBufferedReader(Path.of(CAMINHO + "outros.txt"));

        BufferedWriter writer = Files.newBufferedWriter(Path.of(CAMINHO + "outros.txt"));

        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] colunas = linha.split(";");
            if (colunas[0].equals(matricula)) {
                System.out.println("Qual o novo salario? ");
                String novoSalario = input.nextLine();
                
                linha = linha.replace(";" + colunas[3], ";" + String.valueOf(novoSalario));
            } else {
                System.out.println("Matricula inexistente");
                salarioOutros();
            }

            writer.write(linha + "\n");
        }

        reader.close();
        writer.close();

        System.out.println("Salário atualizado com sucesso");
        gerenteSistema();
    }
}