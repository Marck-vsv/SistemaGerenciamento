package interacoes;

import java.io.IOException;
import java.util.*;
import sistema.Professor;

public class MenuInteracoes {
    Scanner input = new Scanner(System.in);

    public void menuInteracoes() throws IOException {
        System.out.println("------------------------------------");
        System.out.println("BEM VINDO AO SISTEMA FULANO DA SILVA");
        System.out.println("------------------------------------\n");
    
        System.out.println("Você possui cadastro?\n");
    
        System.out.println("[1] Sim");
        System.out.println("[2] Não");
        System.out.println("[3] Sair");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                menuSistemaCadastrado();
                break;
            case 2:
                menuCadastrarUsuario();
                break;
            case 3:
            	System.out.print("FIM DO PROGRAMA");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                menuInteracoes();
        }
    }
    
    public void menuSistemaCadastrado () throws IOException {
        System.out.println("------------------------------------");
        System.out.println("-- ESCOLHA UMA DAS OPÇÕES A SEGUIR: ");
        System.out.println("------------------------------------\n");

        System.out.println("[1] Aluno");
        System.out.println("[2] Professor");
        System.out.println("[3] Gerente");
        System.out.println("[4] Sair");
        int opcao = input.nextInt();

        switch (opcao) {
        case 1:
        	System.out.print("voce é ALUNO");
            menuSistemaCadastrado();
            break;
        case 2:
        	System.out.print("Estamos quase lá.\n");
        	Professor.cadastrarProfessor();
        	Professor.professorSistema();
        
            break;
        case 3:
        	System.out.print("voce é GERENTE");
            System.exit(0);
            break;
        default:
            System.out.println("Opção inválida");
            menuInteracoes();
        }
    }

    public void menuCadastrarUsuario () {
        System.out.println("CRIE UM NOVO USUARIO");

        System.out.println("Nome:");
        String nome = input.next();
        
    }
}
