package com.klasix12.easy;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class OpenCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = reader.readLine().replaceAll(" ", "");
        String l = reader.readLine();

        int res = 0;
        for (String i : new HashSet<>(Arrays.asList(l.split("")))) {
            if (!s.contains(i)) {
                res++;
            }
        }

        writer.write(String.valueOf(res));

        reader.close();
        writer.close();
    }
}
