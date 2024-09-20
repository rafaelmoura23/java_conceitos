package com.example;

import java.util.ArrayList;

public class Curso {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();


    public void addAlunos(Aluno aluno){
        
    }


    public void menu(){
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Multiplicação");
    }
}
