/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.Demo;

import com.btl.Lobby.Lobby;

/**
 *
 * @author DELL
 */
public class Demo {

    public static void main(String[] args) {
        Lobby a1 = new Lobby("Khang", 2, 20, "MONDAY");
        
        
        a1.displayLobby();
        a1.getLobbyPrice().displayPrice();
    }
}
