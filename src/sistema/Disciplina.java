package sistema;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Disciplina {
    private static final String CAMINHO = "C:\\usuariosSis\\disciplina.txt";

    private String nome;
    private String cargaHoraria;
    private String id;

    public Disciplina(String nome, String cargaHoraria, String id) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void lerArquivoDisciplinas() throws IOException {
        File arquivoDisciplinas = new File(CAMINHO);

        Scanner scanner = new Scanner(new FileReader(arquivoDisciplinas));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            String[] dados = linha.split(";");

            Disciplina disciplina = new Disciplina(dados[0], dados[1], dados[2]);

            System.out.println(disciplina);
        }

        scanner.close();
    }
    
    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
