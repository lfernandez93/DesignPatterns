/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.adapter;

/**
 *
 * @author Luis Fernandez
 */
public class QueueOrStack {

    private String[] data;
    private int start;
    private int end;
    private int elements;

    public QueueOrStack() {
        data = new String[10];
    }

    public String startString() {
        return data[start];
    }

    public String endString() {
        return data[end];
    }

    public boolean empty() {
        return (elements == -1);
    }

    public void add(String str) {
        elements++;
        data[end] = str;
        end++;
    }

    public void remove(int pos) {
        for (int i = pos; i < elements; i++) {
            elements--;
            data[i] = data[i + 1];
        }
    }

    public String get(int pos) {
        return data[pos];
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

}
