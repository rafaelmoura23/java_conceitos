package com.example;

import java.util.ArrayList;

public class Curso {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();


    public void addAlunos(Aluno aluno){

    }


    public void menu(){
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Raiz Quadrada");
            System.out.println("6. Sair");
    }
}
