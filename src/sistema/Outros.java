package sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Outros {
    private static String CAMINHO = "C:\\usuariosSis\\";

    Scanner input = new Scanner(System.in);
    public static void outrosSistema () {
        lerOutros("outros.txt", matricula, senha);
    }

    public static void lerOutros (String nomeDoArquivo, String matricula, String senha) {
        try {
            // Abre o arquivo em modo de leitura
            FileReader fileReader = new FileReader(CAMINHO + nomeDoArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                // Divide a linha em colunas usando o separador desejado (por exemplo, ponto e vírgula)
                String[] colunas = linha.split(";");

                // Verifica se dois valores são iguais à entrada procurada
                if (colunas.length >= 2 && colunas[0].equals(matricula) && colunas[2].equals(senha)) {
                    bufferedReader.close();
                    System.out.println(colunas[1] + " | " + colunas[3]);
                    break;
                }
            }
            
            // Fecha o BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
