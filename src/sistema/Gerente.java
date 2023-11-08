package sistema;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("[5] Sair");
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
                System.out.println("FIM DO PROGRAMA");
                System.exit(0);
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

    }

    public static void demitirFuncionario() throws IOException {

    }

    public static void aumentarOuDiminuirSal() throws IOException {

    }
}