package com.example.advanced.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("file.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        try(br){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }


    }
}