/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.Lobby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class LobbyManagementList {
    private final List<Lobby> ds = new ArrayList<>();
    /**
     * them 1 sanh cuoi
     * @param a 
     */
    public void addLobby(Lobby a){
        this.ds.add(a);
    }
    /**
     * them nhieu sanh cuoi
     * @param a 
     */
    public void addLobby(Lobby...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void deleteLobby(Lobby a){
        this.ds.remove(a);
    }
    
    /**
     * 
     * Cap nhat Lobby theo vi tri
     * @param vt: vi tri cua sanh
     * @return 
     */
    public Lobby updateLobby(int vt){
        Lobby a = new Lobby();
        a = this.ds.stream().filter(h -> h.getLobbyLocation()== vt).findFirst().get();
        System.out.print("Nhap thoi gian: ");
        a.setThoiGian(PublicFunc.SC.nextLine()); 
        System.out.print("Nhap ten: ");
        a.setLobbyName(PublicFunc.SC.nextLine());
        System.out.print("Nhap vi tri: ");
        a.setLobbyLocation(PublicFunc.SC.nextInt());
        System.out.print("Nhap suc chua: ");
        a.setLobbyCapacity(PublicFunc.SC.nextInt());
        return a;
    }
    
    
    
    
    
    
    /**
     * tra cuu theo suc chua
     * @param cap
     * @return 
     */
    public Lobby searchByCapacity(int cap){
        return this.ds.stream().filter(h -> h.getLobbyCapacity()== cap).findFirst().get();
    }
     /**
      * tra cuu theo vi tri
      * @param loc
      * @return 
      */
    public Lobby searchByLocation(int loc){
        return this.ds.stream().filter(h -> h.getLobbyCapacity()== loc).findFirst().get();
    }
    /**
     * tra cuu theo ten
     * @param name
     * @return 
     */
    public void searchByName(String name){
        List<Lobby> search = new ArrayList<>();
        search = this.ds.stream().filter(h -> h.getLobbyName().contains(name)).collect(Collectors.toList());
        search.forEach(a->a.displayLobby());
    }

    public void displayLobbyList(){
        this.ds.forEach(a -> a.displayLobby());
    }
}
