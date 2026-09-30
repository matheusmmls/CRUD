/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class Conexao {

    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=unip_bd;encrypt=true;trustServerCertificate=true;";
    private static final String User = "sa";
    private static final String Senha = "1234";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, User, Senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar!", e);
        }
    }
}
