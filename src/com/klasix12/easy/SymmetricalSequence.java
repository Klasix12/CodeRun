package com.klasix12.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SymmetricalSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());
        StringBuilder sequence = new StringBuilder(reader.readLine().replaceAll(" ", ""));
        reader.close();

        for (int i = 0; i < size; i++) {
            StringBuilder temp = new StringBuilder(sequence.substring(0, i)).reverse();
            if (isSymmetrical(sequence.toString() + temp)) {
                writer.write(i + "\n");
                writer.write(String.join(" ", temp.toString().split("")));
                break;
            }
        }

        writer.close();
    }

    private static boolean isSymmetrical(String sequence) {
        int length = sequence.length();
        for (int i = 0; i < length; i++) {
            if (sequence.charAt(i) != sequence.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
