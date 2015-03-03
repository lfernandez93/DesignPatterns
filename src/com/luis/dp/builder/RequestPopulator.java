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
public class RequestPopulator {

    private Builder<Request> builder = null;

    public RequestPopulator(Builder b) {
        this.builder = b;
    }

    public void addAgentAndRequest(String idRequest, Person agent) {
        builder.addAgentAndRequest(idRequest, agent);
    }

    public void addUserInfo(Person user) {
        builder.addUserInfo(user);
    }

    public void addContent(String reqContent) {
        builder.addContent(reqContent);
    }

    public void addAnswer(String reqAnswer) {
        builder.addAnswer(reqAnswer);
    }

    public void addMiscellaneous(boolean isAnswered, boolean needCallBack) {
        builder.addMiscellaneous(isAnswered, needCallBack);
    }

    public Request construct() {
        return builder.build();
    }

}
