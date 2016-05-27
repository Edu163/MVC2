/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.ArrayList;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import  DB.Conexion;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Garse
 */
public class HumanJugador {
    private String nombre;
    private String password;
    private String jefeTerreno;

    public HumanJugador() {
       
    }

    public HumanJugador(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    
    
    

   

    public String getJefeTerreno() {
        return jefeTerreno;
    }

    public void setJefeTerreno(String jefeTerreno) {
        this.jefeTerreno = jefeTerreno;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validarLogin(String nombreUsuario, String contrasena) throws SQLException{
    
      
      String sql = "SELECT nombreUsuario,pass FROM Usuarios WHERE nombreUsuario = '" + nombreUsuario +"' AND pass='" + contrasena +"'";
      try{  
      Conexion co = new Conexion();
        Statement resultado = co.consultar();
        
        ResultSet rs = resultado.executeQuery(sql);
               rs.last();
               int confirmacion = rs.getRow();
               System.out.println(confirmacion);
                   if (confirmacion==1)
                   {
                       
                       
                       
                       
                       
                   return true;    
                   }
                   else{
                       
                   }
                  }catch (Exception e) {
                    System.out.println(e);
            
                }
          
                  return false;
    }   
    
}             
        
    
    // Funciones DB
    
