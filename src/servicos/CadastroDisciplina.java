package servicos;

import java.util.ArrayList;
import java.util.Scanner;

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
        	System.out.print("Fim do programa,volte sempre!");
            break;
        case 2:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(1));
        	System.out.print("Fim do programa,volte sempre!");
            break;
        case 3:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(2));
        	System.out.print("Fim do programa,volte sempre!");
            break;
        case 4:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(3));
        	System.out.print("Fim do programa,volte sempre!");
            break;
        case 5:
        	System.out.print("Voçe adicionou a disciplina :" + disciplinas.get(4));
        	System.out.print("Fim do programa,volte sempre!");
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
    
    
}

