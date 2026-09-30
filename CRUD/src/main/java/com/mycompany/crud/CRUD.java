/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.crud;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class CRUD {

    public static void main(String[] args) {
        
        painelAlunos tela = new painelAlunos();
        tela.setVisible(true);
        
        try (Connection conexao = Conexao.conectar()){
            System.out.println("Conectado ao sql com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
