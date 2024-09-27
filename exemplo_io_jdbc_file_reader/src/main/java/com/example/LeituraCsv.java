package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraCsv {

    String arquivoCSV = "C:\\Users\\DevTarde\\Documents\\Workstation Rafael\\java_conceitos\\exemplo_io_jdbc_file_reader\\src\\main\\java\\com\\example\\dados.csv";
    String linha = "";
    String divisor = ",";
    public void teste() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {

            if ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(divisor);
                for (String coluna : colunas) {
                    System.out.print(coluna + " ");
                }
                System.out.println("");
               
            }

            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(divisor);
                for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
