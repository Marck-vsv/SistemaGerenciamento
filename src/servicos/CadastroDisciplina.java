package servicos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import sistema.Aluno;
import sistema.Professor;

public class CadastroDisciplina  {
	static Scanner sc = new Scanner(System.in);
    public static  void listaDisciplinas () {
    	Scanner input = new Scanner(System.in);
        ArrayList<String> disciplinas = new ArrayList<>();

        // Adiciona 5 disciplinas à lista
        disciplinas.add("\n[1]Matematica| carga horaria:  60| Professor: MAURO");
        disciplinas.add("\n[2]Portugues | carga horaria:  60| Prof.:FELIPE ");
        disciplinas.add("\n[3]Quimica   | carga horaria:  60| Prof:Danilo ");
        disciplinas.add("\n[4]Fisica    | carga horaria:  60| Prof:MARIO ");
        disciplinas.add("\n[5]Biologia  | carga horaria:  60| Prof.:MARIA ");
        
        System.out.println(disciplinas);
        
        int opcao = input.nextInt();
        switch (opcao) {
        case 1:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(0));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 2:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(1));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 3:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(2));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 4:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(3));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 5:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(4));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        default:
            System.out.println("Opção inválida");    
        }
    }
    
    public static  void listaDisciplinas2 () {
    	Scanner input = new Scanner(System.in);
        ArrayList<String> disciplinas = new ArrayList<>();

        // Adiciona 5 disciplinas à lista
        disciplinas.add("\n[1]Matematica| carga horaria:  60| Professor: MAURO");
        disciplinas.add("\n[2]Portugues | carga horaria:  60| Prof.:FELIPE ");
        disciplinas.add("\n[3]Quimica   | carga horaria:  60| Prof:Danilo ");
        disciplinas.add("\n[4]Fisica    | carga horaria:  60| Prof:MARIO ");
        disciplinas.add("\n[5]Biologia  | carga horaria:  60| Prof.:MARIA ");
        
        System.out.println(disciplinas);
        
        int opcao = input.nextInt();
        switch (opcao) {
        case 1:
        	System.out.print("Voçe removeu a disciplina :" + disciplinas.get(0));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 2:
        	System.out.print("Voçe removeu a disciplina :" + disciplinas.get(1));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 3:
        	System.out.print("Voçe removeu a disciplina :" + disciplinas.get(2));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 4:
        	System.out.print("Voçe removeu a disciplina :" + disciplinas.get(3));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 5:
        	System.out.print("Voçe removeu a disciplina :" + disciplinas.get(4));
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        default:
            System.out.println("Opção inválida");    
        }
    }
    
    
    public static  void listaDisciplinas3 () throws IOException {
    	Scanner input = new Scanner(System.in);
        
        // Mostra as 5 disciplinas disponiveis
        System.out.println("[1]Matematica");
        System.out.println("[2]Portugues");
        System.out.println("[3]Quimica");
        System.out.println("[4]Fisica");
        System.out.println("[5]Biologia");

        Random random = new Random();
        int nota = random.nextInt(11);
    	
        int opcao = input.nextInt();
        switch (opcao) {
        case 1:
        	System.out.print("Voçe tirou " + nota + " em Matematica");
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 2:
        	System.out.print("Voçe tirou " + nota + " em Portugues\n");
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 3:
        	System.out.print("Voçe tirou " + nota + " em Quimica\n");
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 4:
        	System.out.print("Voçe tirou " + nota + " em Fisica\n");
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        case 5:
        	System.out.print("Voçe tirou " + nota + " em Biologia \n");
        	System.out.print("\nFim do programa,volte sempre!");
            break;
        default:
            System.out.println("Opção inválida");    
        }
    }
    
    public static  void listaDisciplinas4 () throws IOException {
    	Scanner input = new Scanner(System.in);
        
        // Mostra as 5 disciplinas disponiveis
        System.out.println("[1]Matematica");
        System.out.println("[2]Portugues");
        System.out.println("[3]Quimica");
        System.out.println("[4]Fisica");
        System.out.println("[5]Biologia");

        Random random = new Random();
        int nota1 = random.nextInt(11);
        int nota2 = random.nextInt(11);
        float media = (nota1+nota2)/2;
    	
        int opcao = input.nextInt();
        switch (opcao) {
        case 1:
        	System.out.print("Suas notas são " + nota1 + " e " + nota2);
        	System.out.print(" ||Sua media em Matematica é : " + media);
        	System.out.print("\nFim do programa,volte sempre!");
        	System.out.println("\n------------------------------------\n");
            break;
        case 2:
        	System.out.print("Suas notas são " + nota1 + " e " + nota2);
        	System.out.print(" ||Sua media em Portugues é : " + media);
        	System.out.print("\nFim do programa,volte sempre!");
        	System.out.println("\n------------------------------------\n");
            break;
        case 3:
        	System.out.print("Suas notas são " + nota1 + " e " + nota2);
        	System.out.print(" ||Sua media em Quimica é : " + media);
        	System.out.print("\nFim do programa,volte sempre!");
        	System.out.println("\n------------------------------------\n");
            break;
        case 4:
        	System.out.print("Suas notas são " + nota1 + " e " + nota2);
        	System.out.print(" ||Sua media em Fisica é : " + media);
        	System.out.print("\nFim do programa,volte sempre!");
        	System.out.println("\n------------------------------------\n");
            break;
        case 5:
        	System.out.print("Suas notas são " + nota1 + " e " + nota2);
        	System.out.print(" ||Sua media em Biologia é : " + media);
        	System.out.print("\nFim do programa,volte sempre!");
        	System.out.println("\n------------------------------------\n");
            break;
        default:
            System.out.println("Opção inválida");    
        }
    }
}

