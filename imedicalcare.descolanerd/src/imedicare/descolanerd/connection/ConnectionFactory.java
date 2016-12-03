/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imedicare.descolanerd.connection;

import imedicalcare.descolanerd.exceptions.ConexaoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodolfo
 */
public class ConnectionFactory {
    public static Connection conector() throws Exception{
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sistemaos";
        String user = "root";
        String password = "root";
        //Estabelecendo a conexão com o BD
        try{     
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);
        }catch(SQLException | ClassNotFoundException e){
            throw new ConexaoException(e);
        }
        return conexao;
    
    }  
    
}
