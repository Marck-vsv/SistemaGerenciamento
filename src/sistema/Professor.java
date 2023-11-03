package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import servicos.CadastroDisciplina;

public class Professor extends Usuario{
    private String nome;
    private String matricula;

    ArrayList<String> listaClientes = new ArrayList<String>();

    static Scanner sc = new Scanner(System.in);

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Professor(){
    }
    
    public static void cadastrarProfessor() throws IOException {
    	
        boolean nomeExist= false;
        System.out.print("| Informe seu nome: ");
        String nomeProfessor = sc.nextLine();

        System.out.print("| Informe a sua matricula:\n");
        String matriculaProfessor = sc.nextLine();

        Professor professor = new Professor(nomeProfessor,matriculaProfessor);
        
        System.out.print("Olá professor " + professor.nome +"| Matricula : " + professor.matricula);
        }
        
        
    public static void professorSistema () throws IOException {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n------------------------------------");
            System.out.println("\n-- ESCOLHA UMA DAS OPÇÕES A SEGUIR: ");
            System.out.println("\n------------------------------------\n");

            System.out.println("[1] Adicionar Disciplina");
            System.out.println("[2] Remover Disciplina");
            System.out.println("[3] Ver Carga Horaria");
            System.out.println("[4] Sair");
            int opcao = input.nextInt();

            switch (opcao) {
            case 1:
            	System.out.print("\nAdicionar disciplina\n");
            	CadastroDisciplina.listaDisciplinas();
                break;
            case 2:
            	System.out.print("Remover Disciplina:\n");
            	CadastroDisciplina.listaDisciplinas2();
                break;
            case 3:
            	System.out.print("Ver carga horaria");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
            }
        }
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

