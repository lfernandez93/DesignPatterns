/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.abstractfactory;

/**
 *
 * @author Luis Fernandez
 */
public class TextHeader implements Header {

    String content;

    public TextHeader(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String print() {
        return content;
    }

}
