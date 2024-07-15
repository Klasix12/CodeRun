package com.klasix12.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsListGrowing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = reader.readLine().split(" ");
        int cur = Integer.parseInt(s[0]);
        String res = "YES";
        for (int i = 1; i < s.length; i++) {
            if (Integer.parseInt(s[i]) <= cur) {
                res = "NO";
                break;
            } else {
                cur = Integer.parseInt(s[i]);
            }
        }

        writer.write(res);
        reader.close();
        writer.close();
    }
}
