/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.composite;

/**
 *
 * @author Luis Fernandez
 */
public class Permutator {
    private int count;
    void permutate(char[] x, int n) {
        x = x.clone();
        if (n == 1) {
            System.out.print(++count+" ");
            System.out.print(x);
            System.out.print("\n");
            //counter++;
        } else {
            for (int j = 0; j < n; j++) {
                permutate(x, n - 1);
                swap(x, j, n - 1);

            }
        }
    }

    void swap(char[] x, int a, int b) {
        char temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
