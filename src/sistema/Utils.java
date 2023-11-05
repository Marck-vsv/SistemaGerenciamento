package sistema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {

    Scanner sc = new Scanner(System.in);
    
    public List<List<String>> leitorFile (String caminho, String nome) {
        
        List<List<String>> lista = new ArrayList<>();

        File fileDir = new File(caminho);
        File fileLeitor = new File(fileDir, nome);

        try {

            FileReader reader = new FileReader(fileLeitor);

            BufferedReader buffer = new BufferedReader(reader);

            String linha = "";

            while ((linha = buffer.readLine()) != null) {

                if (!linha.isEmpty()) {

                    String[] values = linha.split(";");

                    lista.add(Arrays.asList(values));
                }   
            }

            reader.close();
            buffer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
