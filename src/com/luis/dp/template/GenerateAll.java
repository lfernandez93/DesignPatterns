/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.template;

/**
 *
 * @author Luis Fernandez
 */
public class GenerateAll extends LetterGeneratorTemplate {

    @Override
    public String[][] recreateLetter(Letter letter) {
        String[][] completeLetter = null;
        switch (letter.getType()) {
            case VERTICAL:
                completeLetter = new String[letter.getRow()][letter.getColumn() * 2];

                for (int i = 0; i < completeLetter.length; i++) {
                    int counter = letter.getColumn() - 1;
                    for (int j = 0; j < completeLetter[i].length; j++) {

                        if (j < letter.getColumn()) {

                            completeLetter[i][j] = letter.getLetterClue()[i][j];
                        } else {
                            completeLetter[i][j] = letter.getLetterClue()[i][counter];
                            counter--;
                        }
                    }

                }
                break;
            case NONE:
                completeLetter = letter.getLetterClue();
                break;
            case HORIZONTAL:
                completeLetter = new String[letter.getRow() * 2][letter.getColumn()];
                int count = letter.getRow()-1;
                for (int i = 0; i < completeLetter.length; i++) {

                    for (int j = 0; j < completeLetter[i].length; j++) {
                        if (i < letter.getRow()) {
                            completeLetter[i][j] = letter.getLetterClue()[i][j];
                        } else {
                            completeLetter[i][j] = letter.getLetterClue()[count][j];
                        }
                    }
                    if (i >= letter.getRow()) {
                        count--;
                    }
                }
                break;
        }
        return completeLetter;
    }

    @Override
    public void display(String[][] recreation
    ) {
        for (int i = 0; i < recreation.length; i++) {
            for (int j = 0; j < recreation[0].length; j++) {
                System.out.print(recreation[i][j]);
            }
            System.out.println("");
        }
    }

}
