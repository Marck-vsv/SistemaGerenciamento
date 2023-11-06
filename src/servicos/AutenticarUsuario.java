package servicos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import sistema.*;

public class AutenticarUsuario {
    private final String CAMINHO = "C:\\usuariosSis\\";

    Scanner input = new Scanner(System.in);

    public boolean authAluno () {
        System.out.println("MATRICULA: ");
        String matricula = input.next();

        System.out.println("SENHA: ");
        String senha = input.next();

        String retorno = retornaUsuAutenticado("aluno.txt", matricula, senha);

        if (retorno.isBlank()) {
            System.out.println("USUARIO NÃO ENCONTRADO, TENTE NOVAMENTE");
            authAluno();
        }

        return true;
    }
    
    public boolean authProfessor () throws IOException {
        System.out.println("MATRICULA: ");
        String matricula = input.next();

        System.out.println("SENHA: ");
        String senha = input.next();

        String retorno = retornaUsuAutenticado("professor.txt", matricula, senha);

        if (retorno.isBlank()) {
            System.out.println("USUARIO NÃO ENCONTRADO, TENTE NOVAMENTE");
            authProfessor();
        }

        return true;
    }

    public boolean authGerente () throws IOException {
        System.out.println("MATRICULA: ");
        String matricula = input.next();

        System.out.println("SENHA: ");
        String senha = input.next();

        String retorno = retornaUsuAutenticado("gerente.txt", matricula, senha);

        if (retorno.isBlank()) {
            System.out.println("USUARIO NÃO ENCONTRADO, TENTE NOVAMENTE");
            authGerente();
        }

        return true;
    }

    public boolean authOutros () throws IOException {
        System.out.println("MATRICULA: ");
        String matricula = input.next();

        System.out.println("SENHA: ");
        String senha = input.next();

        String retorno = retornaUsuAutenticado("outros.txt", matricula, senha);

        if (retorno.isBlank()) {
            System.out.println("USUARIO NÃO ENCONTRADO, TENTE NOVAMENTE");
            authOutros();
        }

        return true;
    }

    public void authFuncionario () throws IOException {
        System.out.println("SELECIONE O TIPO DE FUNCIONÁRIO: ");
        System.out.println("[1] Gerente");
        System.out.println("[2] Professor");
        System.out.println("[3] Outros");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                if (authGerente()) {
                    Gerente.gerenteSistema();
                }
                break;
            case 2:
                if (authProfessor()) {
                    Professor.professorSistema();
                }
                break;
            case 3:
                if (authOutros()) {
                    Outros.outrosSistema();
                }
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                authFuncionario();
        }
    }

    public String retornaUsuAutenticado (String nomeDoArquivo, String matricula, String senha) {
        try {
            // Abre o arquivo em modo de leitura
            FileReader fileReader = new FileReader(CAMINHO + nomeDoArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                // Divide a linha em colunas usando o separador desejado (por exemplo, ponto e vírgula)
                String[] colunas = linha.split(";");

                // Verifica se dois valores são iguais à entrada procurada
                if (colunas.length >= 2 && colunas[0].equals(matricula) && colunas[2].equals(senha)) {
                    bufferedReader.close();
                    return linha;
                }
            }
            
            // Fecha o BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return "";
    }
}
