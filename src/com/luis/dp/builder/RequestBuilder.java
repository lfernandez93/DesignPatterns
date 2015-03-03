/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.builder;

/**
 *
 * @author Luis Fernandez
 */
public class RequestBuilder implements Builder<Request> {

    private Request requestToFill;

    public RequestBuilder() {
        requestToFill = new Request();
    }

    @Override
    public void addAgentAndRequest(String idRequest, Person agent) {
        requestToFill.setAgent(agent);
        requestToFill.setReqId(idRequest);
    }

    @Override
    public void addUserInfo(Person user) {
        requestToFill.setRequester(user);
    }

    @Override
    public void addContent(String reqContent) {
        requestToFill.setReqContent(reqContent);
    }

    @Override
    public void addAnswer(String reqAnswer) {
        requestToFill.setRespContent(reqAnswer);
    }

    @Override
    public void addMiscellaneous(boolean isAnswered, boolean needCallBack) {
        requestToFill.setIsAnswered(isAnswered);
        requestToFill.setNeedCallBack(needCallBack);
    }

    @Override
    public Request build() {
        return requestToFill;
    }

}
