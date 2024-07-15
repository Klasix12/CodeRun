package com.klasix12.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

// не решил
public class WordsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder res = new StringBuilder();
        String in = reader.readLine();
        while (!(in.isEmpty())) {
            res.append(in);
            in = reader.readLine();
            System.out.println(in);
        }

        writer.write(String.valueOf(Arrays.stream(res.toString().strip().split(" ")).collect(Collectors.toSet()).size()));

        reader.close();
        writer.close();
    }
}
