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
public interface ReportFactory {
    public Header createHeader(String content);
    public Content createContent(List<Request> requests);
    public Footer createFooter(String content);
}
