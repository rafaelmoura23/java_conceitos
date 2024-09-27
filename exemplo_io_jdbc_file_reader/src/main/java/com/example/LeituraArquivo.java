package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    String srcFile = "C:\\Users\\DevTarde\\Documents\\Workstation Rafael\\java_conceitos\\exemplo_io_jdbc_file_reader\\src\\main\\java\\com\\example\\dados.txt";
        public void teste() {
            try (BufferedReader br = new BufferedReader(new FileReader(srcFile))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    