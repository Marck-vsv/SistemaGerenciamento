package sistema;

import java.io.*;
import java.util.Scanner;

import interacoes.MenuSistema;

import java.util.Random;
import java.util.ArrayList;

public class Aluno {
	private String nome;
    private String matricula;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static ArrayList<Double> notaAlunos = new ArrayList<Double>();

    public Aluno(String matricula, String nome, String senha) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno(){
    	
    }

    public static void alunoSistema () throws IOException {
    	try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nESCOLHA UMA DAS OPÇÕES A SEGUIR: ");

            System.out.println("[1] Ver Disciplinas");
            System.out.println("[2] Fazer Avaliaçao");
            System.out.println("[3] Calcular Media");
            System.out.println("[4] Voltar ");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    Disciplina.lerArquivoDisciplinas();
                    alunoSistema();
                    break;
                case 2:
                    fazerAvaliacao();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 4:
                    MenuSistema.menuSistema();
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    alunoSistema();
            }
        }
    }

    public static void fazerAvaliacao () throws IOException {
        double notaAleatoria = Math.round(random.nextDouble() * 10);
        notaAlunos.add(notaAleatoria);
        alunoSistema();
    }

    public static void calcularMedia () throws IOException {
        double soma = 0;
        for (double valor : notaAlunos) {
            soma += valor;
        }

        double media = soma / notaAlunos.size();

        String notaFormatada = String.format("%.2f", media);

        System.out.println("Média: " + notaFormatada);
        alunoSistema();
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
