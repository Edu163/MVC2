/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DB.HumanJugador;
import vistas.LogInVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vistas.vistaHistorial;
import vistas.vistaTablero;


/**
 *
 * @author Eduardo
 */
public class ControladorPrincipal implements ActionListener {
    private LogInVista ventana;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorPrincipal cp= new ControladorPrincipal();
        cp.ventana = new LogInVista();
        cp.ventana.setVisible(true);
        cp.ventana.setTitle("Dungeon Dice Monster");
        cp.ventana.setResizable(false);
        cp.ventana.setLocation(600, 300);
        cp.ventana.agregarListener(cp);
        
        
    
        
    }

    
      public void actionPerformed(ActionEvent e){
          if(ventana.getButtonBtnlogin()==e.getSource()){
              
              HumanJugador hj = new HumanJugador(ventana.getNombreUsuario(), ventana.getPassword());
              try{
              boolean login = hj.validarLogin(ventana.getNombreUsuario(), ventana.getPassword());
              if (login == true)
              {
                  JOptionPane.showMessageDialog(ventana, "inicio de seción exitoso");
                  ventana.dispose();
                  vistaTablero v=new vistaTablero();
                  v.setVisible(true);
              }
              else{
                  JOptionPane.showMessageDialog(ventana, "usuario o contraseña invalida");
              }
              //poner los string en ""
              ventana.setTxtUserPass();
              
          
         
          
        }catch(Exception a){
              

          }
      }
}
} 
          
      
           
                
 
    
               
