package sistema;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import servicos.CadastroDisciplina;


public class Aluno {
	private String nome;
    private String matricula;
    private String senha;

    ArrayList<String> listaClientes = new ArrayList<String>();

    static Scanner sc = new Scanner(System.in);
    
    public Aluno(String matricula, String nome, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha= senha;
    }
    public Aluno(){
    	
    }
	
    public static void AlunoSistema () throws IOException {
    	Scanner input = new Scanner(System.in);
        System.out.println("\n------------------------------------");
        System.out.println("\n-- ESCOLHA UMA DAS OPÇÕES A SEGUIR: ");
        System.out.println("\n------------------------------------\n");

        System.out.println("[1] Adicionar Disciplina");
        System.out.println("[2] Remover Disciplina");
        System.out.println("[3] Fazer Avaliaçao");
        System.out.println("[4] Calcular Media");
        System.out.println("[5] Sair ");
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
        	System.out.print("Escolha a disciplina:\n");
        	CadastroDisciplina.listaDisciplinas3();
            System.exit(0);
            break;
        case 4:
        	System.out.print("Escolha a disciplina:\n");
        	CadastroDisciplina.listaDisciplinas4();
            break;
        case 5:
        	System.out.print("Fim do programa,volte sempre!\n");
            break;
        default:
            System.out.println("Opção inválida");
            Aluno.AlunoSistema();
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
