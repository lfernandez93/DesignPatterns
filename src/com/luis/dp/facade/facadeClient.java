/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luis.dp.facade;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 984201
 */
public class facadeClient {

    public static void main(String[] arg) {
        DBFacade dbManager = new DBFacade();
        dbManager.connect("localhost/db");
        dbManager.query("SELECT * FROM myTable");
        dbManager.callProcedure("call Procedure()");
    }

}
