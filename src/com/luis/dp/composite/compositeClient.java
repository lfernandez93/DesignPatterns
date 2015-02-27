/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.dp.composite;

/**
 *
 * @author 984201
 */
public class compositeClient {
    
    public static void main(String[] args) {
        int n = 4;
        char[] theCharArray =  generateString(n);
        Permutator p = new Permutator();
        p.permutate(theCharArray,n);
    }
    
    public static char[]  generateString(int n){
        char a = 'a';
        char[] theCharArray = new char[n];
        for (int i = 0; i < n; i++) {
            theCharArray[i]=a++;
        }
        return theCharArray;
    }
    
    
}
