/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.interpreter;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Luis Fernandez
 */
public class Interpreter {

    public boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    public Expression getOperatorInstance(String s, Expression left,
            Expression right) {
        switch (s) {
            case "+":
                return new PlusExpression(left, right);
            case "-":
                return new MinusExpression(left, right);
        }
        return null;
    }

    private String[] reverseVector(String[] toReverse) {
        String[] reversed = new String[toReverse.length];
        int c = 0;
        for (int i = toReverse.length - 1; i >= 0; i--) {
            reversed[c] = toReverse[i];
            c++;
        }
        return reversed;
    }

    public void interpret(String tokenString) {

        Stack<Expression> operands = new Stack();
        // Stack<Expression> operators = new Stack();

        String[] tokenCopy = tokenString.split(" ");
        String[] tokenList = reverseVector(tokenCopy);

        for (String s : tokenList) {
            if (isOperator(s)) {

                Expression rightExpression = operands.pop();
                Expression leftExpression = operands.pop();
                Expression operator = getOperatorInstance(s, rightExpression,
                        leftExpression);
                // int result = Integer.parseInt(operator.interpret());
                operands.push(operator);
            } else {
                Expression i = new NumberExpression(Integer.parseInt(s));
                operands.push(i);
            }
        }
        System.out.println("Result: " + operands.pop().interpret());
    }
}
