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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 984201
 */
public class DBManager {

    private Connection conn;

    public Connection connect(String url) {
        try {
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public void query(String query) {
        try {
            PreparedStatement prep = null;
            try {
                prep = conn.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            prep.setString(1, "<column value>");
            ResultSet rset = prep.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString("<column name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void callProcedure(String procedure) {
        try {
            CallableStatement call = null;
            try {
                call = conn.prepareCall(procedure);
            } catch (SQLException ex) {
                Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            call.setInt(1, 1972);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
            System.out.println(call.getInt(2));
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
