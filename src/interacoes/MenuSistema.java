package interacoes;

import java.io.IOException;
import java.util.Scanner;

import servicos.*;
import sistema.*;

public class MenuSistema {
    Scanner input = new Scanner(System.in);

    public void menuSistema () throws IOException {
        System.out.println("------------------------------------");
        System.out.println("= BEM VINDO AO SEU SISTEMA ESCOLAR =");
        System.out.println("------------------------------------\n");
    
        System.out.println("Você possui cadastro?\n");
    
        System.out.println("[1] Sim");
        System.out.println("[2] Não");
        System.out.println("[3] Sair");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                acoesSistema();
                break;
            case 2:
                CadastroUsuario cadUsu = new CadastroUsuario();
                cadUsu.menuCadastroUsuario();
                break;
            case 3:
            	System.out.print("FIM DO PROGRAMA");
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                menuSistema();
        }
    }

    public void acoesSistema () throws IOException {
        System.out.println("QUEM ESTÁ ENTRANDO NO SISTEMA?");

        System.out.println("[1] Aluno");
        System.out.println("[2] Funcionário");
        System.out.println("[3] Sair");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                AutenticarUsuario authAlu = new AutenticarUsuario();
                if (authAlu.authAluno() == true) {
                    Aluno.AlunoSistema();
                }
                break;
            case 2:
                AutenticarUsuario authFunc = new AutenticarUsuario();
                authFunc.authFuncionario();
                break;
            case 3:
                System.out.println("FIM DO PROGRAMA");
                System.exit(0);
                break;
            default:
                System.out.println("OPCAO INVALIDA");
                acoesSistema();
        }
    }

}
