package com.mycompany.connection.mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus
 */
public class connectdatabase {
    public static void main(String[] args) throws SQLException {
        Connection login = null;
        try {
            Class.forName("con.mysql.jdbc.Driver");
            login = DriverManager.getConnection("jdbc:mysql://localhost/database", "user", "password");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não identificado. Tente instalar ou apontar.");
            Logger.getLogger(connectdatabase.class.getName()).log(Level.SEVERE, null, ex);
                         
        } catch (SQLException ex) {
                System.out.println("Houve um erro ao se conectar ao banco: " + ex.getMessage());
         /* finalizando a conexão com o banco */
        } finally {
            if (login != null) {
                login.close();
            }
        }
    }
}
