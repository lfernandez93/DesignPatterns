/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.template;

import java.util.Arrays;

/**
 *
 * @author Luis Fernandez
 */
public abstract class LetterGeneratorTemplate {

    public void generateLetter(Letter letter) {
        String [][] letterRecreated = recreateLetter(letter);
        display(letterRecreated);
    }
    
    public abstract String[][] recreateLetter(Letter letter);
    
    public abstract void display(String[][] recreation);
        
    

}
