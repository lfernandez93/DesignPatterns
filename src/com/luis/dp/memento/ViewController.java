/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.memento;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 984201
 */
public class ViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField id;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField dob;
    private ClientController cc = new ClientController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private Client createFromGui() {
        Client clientToSave = new Client();
        clientToSave.setId(Integer.valueOf(id.getText()));
        clientToSave.setFirstName(firstName.getText());
        clientToSave.setLastName(lastName.getText());
        clientToSave.setDob(dob.getText());
        return clientToSave;
    }

    @FXML
    private void handleSave(ActionEvent actionEvent) {
        cc.save(createFromGui());
    }

    @FXML
    private void handlePersist(ActionEvent actionEvent) {
        cc.persist(createFromGui());
        Client client = new Client();
        setGui(client);
        
    }

    private void setGui(Client client) {
        System.out.println(client);
        id.setText(client.getId() + "");
        firstName.setText(client.getFirstName());
        lastName.setText(client.getLastName());
        dob.setText(client.getDob());
    }

    @FXML
    private void handleUndo() {
        setGui(cc.undo());
    }

    @FXML
    private void handleRead() {
        Integer i = Integer.valueOf(id.getText());
        setGui(cc.read(i));
    }

}
