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
public final class Report {

    private Header header;
    private Content content;
    private Footer footer;

    @Override
    public String toString() {
        String reportString = "";
        reportString += header.print() + "\n";
        reportString += content.print() + "\n";
        reportString += footer.print();
        return reportString;
    }

    public Report(Header header, Content content, Footer footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

}
