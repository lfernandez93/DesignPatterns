/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.template;

/**
 *
 * @author 984201
 */
public class clientTemplate {

    public static void main(String[] args) {

        String[][] letterClue = {{"-", "-", "-", "-", "-"},
        {"-", "-", "-", "-", "+"},
        {"-", "-", "-", "+", "+"},
        {"-", "-", "+", "+", "-"},
        {"-", "-", "+", "+", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "+", "+"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"},
        {"-", "+", "+", "-", "-"}
        };

        String[][] letterB = {
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "+", "+", "+", "+", "+", "-", "-"},
            {"-", "-", "-", "+", "+", "-", "-", "+", "+", "-"},
            {"-", "+", "+", "-", "-", "-", "-", "-", "+", "+"},
            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},};

        Letter l = new Letter("The letter A", LetterEnum.NONE, letterB);
        LetterGeneratorTemplate lgt = new GenerateAll();
        lgt.generateLetter(l);

    }
}
