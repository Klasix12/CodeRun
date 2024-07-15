package com.klasix12.easy;

import java.io.*;
import java.util.Arrays;

public class MediumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write(Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).sorted().toList().get(1).toString());

        reader.close();
        writer.close();
    }

}
