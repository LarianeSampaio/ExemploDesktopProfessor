/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConectaBancoDados {
    public static Connection ConectaBancoDados() throws ClassNotFoundException {
            try{
            Class.forName("org.postgresql.Driver");
            Connection conecta = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_exemploconexao","postgres","postgres");
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
            return conecta;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Não conectou");
            return null;
        }
    }
}
