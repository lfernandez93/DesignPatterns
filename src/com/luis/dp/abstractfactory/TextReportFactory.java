/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.abstractfactory;

import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class TextReportFactory implements ReportFactory {

    @Override
    public Header createHeader(String content) {
        return new TextHeader(content);
    }

    @Override
    public Content createContent(List<Request> requests) {
        return new TextContent(requests);
    }

    @Override
    public Footer createFooter(String content) {
        return new TextFooter(content);
    }

}
