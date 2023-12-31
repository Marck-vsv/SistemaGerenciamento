package servicos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import interacoes.MenuSistema;
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
                    try {
                        FileReader fileReader = new FileReader(CAMINHO + "outros.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        
                        String linha;
                        while ((linha = bufferedReader.readLine()) != null) {
                            String[] colunas = linha.split(";");
            
                            String colNome = colunas[1];
                            String colCargo = colunas[3];

                            System.out.println("Nome: " + colNome + " | Cargo: " + colCargo);
                        }
                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                    }
                }

                MenuSistema.menuSistema();
                break;
            default:
                System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                authFuncionario();
        }
    }

    public String retornaUsuAutenticado (String nomeDoArquivo, String matricula, String senha) {
        try {
            FileReader fileReader = new FileReader(CAMINHO + nomeDoArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                String[] colunas = linha.split(";");

                if (colunas.length >= 2 && colunas[0].equals(matricula) && colunas[2].equals(senha)) {
                    bufferedReader.close();
                    return linha;
                }
            }
            
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return "";
    }
}
