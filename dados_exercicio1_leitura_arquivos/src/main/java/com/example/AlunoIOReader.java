package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AlunoIOReader {
    String arquivo = "C:\\Users\\DevTarde\\Documents\\Workstation Rafael\\java_conceitos\\dados_exercicio1_leitura_arquivos\\src\\main\\java\\com\\example\\arquivo.txt";
    List<Aluno> alunos = new ArrayList<>();
    double mediaTurma = 0;

    public AlunoIOReader() {
        alunos = new ArrayList<>();
        readerFileIO();
    }

    public void readerFileIO() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String conteudo[] = linha.split(",");
                Aluno aluno = new Aluno(
                        conteudo[0],
                        Double.parseDouble(conteudo[1]),
                        Double.parseDouble(conteudo[2]),
                        Double.parseDouble(conteudo[3]));
                alunos.add(aluno);

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    public double mediaAlunos(){
        for (Aluno aluno : alunos) {
            mediaTurma += aluno.mediaNotas();
        }
        mediaTurma /= alunos.size();
        return mediaTurma;
    }

    // Aluno com maior nota
    public String alunoMaiorNota(){
        String nomeAluno = "";
        double maiorNota = 0;
        for (Aluno aluno : alunos) {
            if (maiorNota<aluno.maiorNota()) {
                maiorNota = aluno.maiorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com maior Nota é " + nomeAluno + "Com a nota: " + maiorNota;
    }


    // Aluno com menor nota
    public String alunoMenorNota(){
        String nomeAluno = "";
        double menorNota = 10;
        for (Aluno aluno : alunos) {
            if (menorNota>aluno.menorNota()) {
                menorNota = aluno.menorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com menor Nota é " + nomeAluno + "Com a nota: " + menorNota;
    }

}
