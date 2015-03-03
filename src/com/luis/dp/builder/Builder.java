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
public interface Builder<T> {

    public void addAgentAndRequest(String idRequest, Person agent);

    public void addUserInfo(Person user);

    public void addContent(String reqContent);

    public void addAnswer(String reqAnswer);

    public void addMiscellaneous(boolean isAnswered, boolean needCallBack);

    public T build();
}
