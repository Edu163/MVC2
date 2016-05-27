/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public abstract class Jugador {
    String user;
    String password;
    int victorias;
    int derrotas;

    public Jugador(String user, String password, int victorias, int derrotas) {
        this.user = user;
        this.password = password;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
  

    }
    
 