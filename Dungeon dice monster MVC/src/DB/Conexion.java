/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author matias
 */
public class Conexion {

    
    
    private Connection con = null;
    private Statement stmt;
    private ResultSet rs;
    
   

     
                
    public Statement consultar() throws SQLException{
        try {
            
            String url = "jdbc:mysql://localhost:3306/login";
            String usuario = "root";
            String contraseña = "videojuego";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null){
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
                   
               return this.con.createStatement();
               }
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Error con la DB");
            
           
        }       
    
       
            return null;
     
    }
}

     
