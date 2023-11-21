package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import interacoes.MenuSistema;

public class Professor extends Funcionario {
    private String nome;
    private String matricula;

    ArrayList<String> listaClientes = new ArrayList<String>();

    static Scanner sc = new Scanner(System.in);

    public Professor (String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Professor () {

    }   
        
    public static void professorSistema () throws IOException {

    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n------------------------------------");
            System.out.println("\n-- ESCOLHA UMA DAS OPÇÕES A SEGUIR: ");
            System.out.println("\n------------------------------------\n");

            System.out.println("[1] Adicionar Disciplina");
            System.out.println("[2] Ver Carga Horaria");
            System.out.println("[3] Voltar");
            int opcao = input.nextInt();

            switch (opcao) {

            case 1:
            	System.out.print("\nAdicionar disciplina\n");
                cadastrarDisciplina();
                break;
            case 2:
            	System.out.print("Ver carga horaria\n");
            	Professor.professorCargaHoraria();
                break;
            case 3:
                MenuSistema.menuSistema();
                break;
            default:
                System.out.println("Opção inválida");
                Professor.professorSistema();
            }
        }
    }
    // Quando o usuario Professor consultar sua carga horaria.
    public static void professorCargaHoraria () throws IOException {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("Suas Disciplinas: \n");
            System.out.println("[1] Todas");
            
            int opcao = input.nextInt();
            switch (opcao) {
            case 1:
                Disciplina.lerArquivoDisciplinas();
                break;
            default:
                System.out.println("Opção inválida");
            }
        }
    	
    }

    public static void cadastrarDisciplina () throws IOException {
        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();

        System.out.print("Carga Horaria: ");
        String cargaHoraria = sc.nextLine();

        System.out.println("ID da disciplina: ");
        String id = sc.nextLine();

        System.out.println("Quantia max de alunos: ");
        String maxAlunos = sc.nextLine();

        FileWriter fileWriter = new FileWriter("C:\\usuariosSis\\disciplina.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String linha = nome + ";" + cargaHoraria + ";" + id + ";" + maxAlunos;
        bufferedWriter.write(linha);
        bufferedWriter.newLine();
        bufferedWriter.close();

        System.out.println("Informações gravadas com sucesso!");
    }
    
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}

