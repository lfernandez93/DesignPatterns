/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class SquareStatesRepository {

    public List<Square> squareStates = new ArrayList<>();
    public int index = 0;

    public void addState(Square square) {
        squareStates.add(square);
        index = squareStates.size()-1;
    }

    public Square previousOne() {
        index = index - 1;
        Square previousOne = squareStates.get(index);
        return previousOne;
    }
}
