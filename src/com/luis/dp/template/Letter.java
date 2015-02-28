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
public class Letter {

    private String label;
    private LetterEnum type;
    private int row;
    private int column;
    private int completeRow = 10;
    private int completeColumn = 15;
    private String[][] letterClue;

    public Letter(String label, LetterEnum type, String[][] letterClue) {
        this.label = label;
        this.type = type;
        this.row = letterClue.length;
        this.column = letterClue[0].length;
        this.letterClue = letterClue;
    }

    public String[][] getLetterClue() {
        return letterClue;
    }

    public void setLetterClue(String[][] letterClue) {
        this.row = letterClue.length;
        this.column = letterClue[0].length;
        this.letterClue = letterClue;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LetterEnum getType() {
        return type;
    }

    public void setType(LetterEnum type) {
        this.type = type;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getCompleteRow() {
        return completeRow;
    }

    public int getCompleteColumn() {
        return completeColumn;
    }

}
