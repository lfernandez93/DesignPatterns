package com.luis.dp.builder;

class Request {

    private String reqId;
    private Person requester;
    private Person agent;
    private String reqContent;
    private String respContent;
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

    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
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

    @Override
    public String toString() {
        return "Request{" + "reqId=" + reqId + ", requester=" + requester.getFirstName() + ", agent=" + agent.getFirstName() + ", reqContent=" + reqContent + ", respContent=" + respContent + ", isAnswered=" + isAnswered + ", needCallBack=" + needCallBack + '}';
    }

}
