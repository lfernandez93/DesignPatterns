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
public class clientAbstractFactory {

    public static void main(String[] args) {
        Person winta = new Person();
        winta.setId(1);
        winta.setName("winta azzefa");
        Person sheriff = new Person();
        sheriff.setId(2);
        sheriff.setName("sheriff lastname");
        Person donya = new Person();
        donya.setId(3);
        donya.setName("donya izadi");
        Person mou = new Person();
        mou.setId(4);
        mou.setName("mou janki");

        RequestRepository requestRepo = new RequestRepository();
        Request request1 = new Request();
        request1.setReqId("1");
        request1.setRequester(mou);
        request1.setAgent(winta);
        request1.setReqContent("i need to fix my phone");
        Request request2 = new Request();
        request2.setReqId("2");
        request2.setRequester(sheriff);
        request2.setAgent(donya);
        request2.setReqContent("i need you to pay me more");
        Request request3 = new Request();
        request3.setReqId("3");
        request3.setRequester(sheriff);
        request3.setAgent(winta);
        request3.setReqContent("my computer is not working");
        Request request4 = new Request();
        request4.setReqId("4");
        request4.setRequester(winta);
        request4.setAgent(mou);
        request4.setReqContent("all the modules are break");
        
        requestRepo.addRequest(request1);
        requestRepo.addRequest(request2);
        requestRepo.addRequest(request3);
        requestRepo.addRequest(request4);
        
        ReportWriter repWriter = new ReportWriter();
        System.out.println(repWriter.GenerateReport(ReportType.HTML, requestRepo.getRequests()));

    }
}
