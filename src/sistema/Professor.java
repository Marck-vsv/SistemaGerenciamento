package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import servicos.CadastroDisciplina;

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
            	System.out.print("Ver carga horaria\n");
            	Professor.professorCargaHoraria();
                break;
            case 4:
            	System.out.print("Fim do programa,volte sempre!\n");
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
            System.out.println("[1] Matematica");
            System.out.println("[2] Fisica");
            System.out.println("[3] Todas");
            
            int opcao = input.nextInt();
            switch (opcao) {
            case 1:
            	System.out.print("\nMatematica| carga horaria: 40| SALA 01|MANHA ");
            	System.out.print("\nMatematica| carga horaria: 40| SALA 03|MANHA ");
            	System.out.print("\nMatematica| carga horaria: 40| SALA 04|MANHA ");
            	System.out.println("\nTotal :120 Horas");
            	System.out.print("Fim do programa,volte sempre!");
                break;
            case 2:
            	System.out.print("\nFisica    | carga horaria: 40| SALA 03|NOITE ");
            	System.out.print("\nFisica    | carga horaria: 40| SALA 05|NOITE ");
            	System.out.print("\nTotal :80 Horas ");
            	System.out.print("Fim do programa,volte sempre!");
                break;
            case 3:
            	System.out.print("\nMatematica| carga horaria: 40| SALA 01|MANHA ");
            	System.out.print("\nMatematica| carga horaria: 40| SALA 03|MANHA ");
            	System.out.print("\nMatematica| carga horaria: 40| SALA 04|MANHA ");
            	System.out.print("\nFisica    | carga horaria: 40| SALA 03|NOITE ");
            	System.out.print("\nFisica    | carga horaria: 40| SALA 05|NOITE ");
                System.out.println("\nTotal : 200 Horas");
                System.out.print("Fim do programa,volte sempre!");
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

