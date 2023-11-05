import java.util.Random;
import java.util.Scanner;

public class Gerente {
    static Scanner input = new Scanner(System.in);
    private static final String Modelo1 = "Felipe";
    private static final String Cod_modelo1 = "1111";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Digite o nome do gerente:");
        System.out.println("----------------------------");
        String nome = scanner.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("Digite o código de acesso do gerente:");
        System.out.println("----------------------------------------");
        String codigo = scanner.nextLine();
        System.out.println("----------------------------------------");
        if (nome.equals(Modelo1) && codigo.equals(Cod_modelo1)) {
            System.out.println("Gerente autenticado com sucesso!");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Gerente não autenticado!");
            System.out.println("Digite o nome para cadastrar um gerente:");
            String novo ; nome = scanner.nextLine();

            System.out.println("Digite a nova senha do novo gerente:");
            String senha = scanner.nextLine();

            if (nome.equals(Modelo1) && senha.equals(Cod_modelo1)) {
                System.out.println("Gerente cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar gerente!");
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Bem vindo Sr (a) Gerente, o que deseja fazer?");
        System.out.println("[1] Ver Funcionarios!");
        System.out.println("[2] Adicionar Funcionario!");
        System.out.println("[3] Remover Funcionario!");
        System.out.println("[4] Aumentar Salario!");
        System.out.println("[5] Diminuir Salario! ");
        System.out.println("----------------------------------------");
        int opcao = input.nextInt();


        switch (opcao) {
            case 1:
              catalogo();
                break;
            case 2:
              substituto();
                break;
            case 3:
                demetidos();
                break;
            case 4:
                aumento();
                break;
            case 5:
                diminuirsal();
                break;

        }

    }
   public static void catalogo(){
       System.out.println("----------------------------------------");
       System.out.print("os Funcionarios são os professores \n");
       System.out.println(" \n" +
               "professor(a)|Mauro  |\n" +
               "professFor(a)|Felipe |\n" +
               "professor(a)|Danilo |\n" +
               "professor(a)|Mario  |\n" +
               "professor(a)|Maria  | ");
       System.out.println("----------------------------------------");

   }
    public static void substituto (){
        System.out.println("----------------------------------------");
        System.out.println("Qual funcionario você quer adicionar? ");
        System.out.println("[1] Nahtanm|  professor substituto   |");
        System.out.println("[2] Ramsés |  professor de filosofia |");
        System.out.println("[3] Lucas  |  professor de sociologia|");
        System.out.println("----------------------------------------");
        int addfunc = input.nextInt();

        if (addfunc == 1) {
            System.out.println("Você escolheu o professor substituto Nahtanm.");
        } else if (addfunc == 2) {
            System.out.println("Você escolheu o professor de filosofia Ramsés.");
        } else if (addfunc == 3) {
            System.out.println("Você escolheu o professor de sociologia Lucas.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
    public static void demetidos (){
        System.out.println("----------------------------------------");
        System.out.println("Qual funcionario você quer demitir? ");
        System.out.println("[1] Mauro  |  professor   |");
        System.out.println("[2] Felipe |  professor   |");
        System.out.println("[3] Danilo |  professor   |");
        System.out.println("[4] Mario  |  professor   |");
        System.out.println("[5] Maria  |  professora  |");

        System.out.println("----------------------------------------");
        int tchaufunc = input.nextInt();

        if (tchaufunc == 1) {
            System.out.println("Você demitiu o professor Mauro.");
        } else if (tchaufunc == 2) {
            System.out.println("Vocêdemitiu o professor Felipe.");
        } else if (tchaufunc == 3) {
            System.out.println("Você demitiu o professor Danilo.");
        } else if (tchaufunc == 4) {
            System.out.println("Você demitiu o professor Mario.");
        } else if (tchaufunc == 5) {
            System.out.println("Você demitiu a professor Maris.");
        } else {
            System.out.println("Opção inválida.");
        }

    }
    public static void aumento(){
        System.out.println("----------------------------------------");
        System.out.println("Qual funcionario vai ganhar um aumento?");
        System.out.println("[1] Mauro  |  professor   |");
        System.out.println("[2] Felipe |  professor   |");
        System.out.println("[3] Danilo |  professor   |");
        System.out.println("[4] Mario  |  professor   |");
        System.out.println("[5] Maria  |  professora  |");
        System.out.println("----------------------------------------");
        int aumentsalario = input.nextInt();

        if (aumentsalario == 1) {
            System.out.println("o professor Mauro ganhou um aumento.");
        } else if (aumentsalario == 2) {
            System.out.println("o professor Felipe ganhou um aumento.");
        } else if (aumentsalario == 3) {
            System.out.println("professor Danilo ganhou um aumento.");
        } else if (aumentsalario == 4) {
            System.out.println("o professor Mario ganhou um aumento.");
        } else if (aumentsalario == 5) {
            System.out.println("a professor Maris ganhou um aumento.");
        } else {
            System.out.println("Opção inválida.");
        }

    }
    public static void diminuirsal(){
        System.out.println("----------------------------------------");
        System.out.println("Qual funcionario vai ter um salario reduzido?");
        System.out.println("[1] Mauro  |  professor   |");
        System.out.println("[2] Felipe |  professor   |");
        System.out.println("[3] Danilo |  professor   |");
        System.out.println("[4] Mario  |  professor   |");
        System.out.println("[5] Maria  |  professora  |");
        System.out.println("----------------------------------------");
        int diminuirsal = input.nextInt();

        if (diminuirsal == 1) {
            System.out.println("salario do professor Mauro reduzido.");
        } else if (diminuirsal == 2) {
            System.out.println("salario do professor Felipe reduzido.");
        } else if (diminuirsal == 3) {
            System.out.println("salario do professor Danilo reduzido.");
        } else if (diminuirsal == 4) {
            System.out.println("salario do professor Mario reduzido.");
        } else if (diminuirsal == 5) {
            System.out.println("salario da professora Maria reduzido.");
        } else {
            System.out.println("Opção inválida.");
        }

    }
}
