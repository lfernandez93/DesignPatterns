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
public class Request {

    private String reqId;
    private Person requester;
    private Person agent;
    private String reqContent;
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallBack;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public Person getRequester() {
        return requester;
    }

    public void setRequester(Person requester) {
        this.requester = requester;
    }

    public Person getAgent() {
        return agent;
    }

    public void setAgent(Person agent) {
        this.agent = agent;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public boolean isIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public boolean isIsSaleLead() {
        return isSaleLead;
    }

    public void setIsSaleLead(boolean isSaleLead) {
        this.isSaleLead = isSaleLead;
    }

    public boolean isNeedCallBack() {
        return needCallBack;
    }

    public void setNeedCallBack(boolean needCallBack) {
        this.needCallBack = needCallBack;
    }

}
