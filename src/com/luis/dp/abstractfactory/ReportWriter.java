/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.abstractfactory;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class ReportWriter {
    
    public Report GenerateReport(ReportType r, List<Request> content) {
        
        ReportFactory repFact = null;
        switch (r) {
            case HTML:
                repFact = new HTMLReportFactory();
                break;
            case TEXT:
                repFact = new TextReportFactory();
                break;
        }
        Report report = new Report(repFact.createHeader("Riverside report 1.0"), repFact.createContent(content), repFact.createFooter("time: " + new Date() + "\n2015 all rights reserved "));
        return report;
    }
}
