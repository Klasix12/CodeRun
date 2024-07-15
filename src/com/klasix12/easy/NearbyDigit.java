package com.klasix12.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class NearbyDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());
        if (size == 0) {
            return;
        }
        List<Integer> ints = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).toList();
        int target = Integer.parseInt(reader.readLine());

        int nearby = ints.getFirst();

        for (int i = 1; i < size; i++) {
            if (Math.abs(ints.get(i) - target) < Math.abs(nearby - target)) {
                nearby = ints.get(i);
                if (nearby == target) {
                    break;
                }
            }
        }

        writer.write(String.valueOf(nearby));

        reader.close();
        writer.close();
    }
}