/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernandez
 */
public class ClientController {

    private CareTaker<Client> careTaker = new CareTaker();
    private int pointer;
    private List<Client> clientList = new ArrayList();

    public void persist(Client client) {
        clientList.add(client);
    }

    public void save(Client client) {
        Originator<Client> org = new Originator<>();
        org.set(client);
        careTaker.addMemento(org.saveToMemento());
        pointer++;
    }

    public Client undo() {
        Client clientState = null;
        if (pointer > 0) {
            clientState = careTaker.removeMemento(--pointer).getSavedState();
        }

        return clientState;
    }

    public Client read(int id) {
        for (Client singleClient : clientList) {
            if (singleClient.getId() == id) {
                return singleClient;
            }
        }
        return null;
    }
}
