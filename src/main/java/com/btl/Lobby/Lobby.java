/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.Lobby;

/**
 *
 * @author DELL
 */
public class Lobby {

    private static int dem;
    private String lobbyId;
    private String lobbyName;
    private int lobbyLocation;
    private int lobbyCapacity;
    private String thoiGian;
    private LobbyPrice lobbyPrice;
/**
 * -> MA SO SANH TU DONG TANG
 */
    {
        this.setLobbyId(String.format("S%03d", ++dem));
    }
    
    public Lobby() {
    }
    
   
/**
 * NHAP GIA TRI CHO SANH: 
 * + THU MAY
 * + TEN SANH
 * + VI TRI 
 * + SUC CHUA SANH
 */
    public void inputLobby(){
        System.out.print("Nhap ngay thue(MONDAY->SUNDAY): ");
        this.thoiGian = PublicFunc.SC.nextLine();
        System.out.print("Nhap ten sanh: ");
        this.lobbyName = PublicFunc.SC.nextLine();
        System.out.print("Nhap vi tri sanh(tang): ");
        this.lobbyLocation = PublicFunc.SC.nextInt();
        System.out.print("Nhap suc chua sanh(ban): ");
        this.lobbyCapacity = PublicFunc.SC.nextInt();
    }

    public Lobby(String lobbyName, int lobbyLocation, int lobbyCapacity, String thoiGian) {
        this.lobbyName = lobbyName;
        this.lobbyLocation = lobbyLocation;
        this.lobbyCapacity = lobbyCapacity;
        this.thoiGian = thoiGian;
        switch (this.thoiGian) {
            case "MONDAY" -> {
                this.lobbyPrice = LobbyPrice.MONDAY;
            }
            case "TUESDAY" -> {
                this.lobbyPrice = LobbyPrice.TUESDAY;
            }
            case "WEDNESDAY" -> {
                this.lobbyPrice = LobbyPrice.WEDNESDAY;
            }
            case "THURSDAY" -> {
                this.lobbyPrice = LobbyPrice.THURSDAY;
            }
            case "FRIDAY" -> {
                this.lobbyPrice = LobbyPrice.FRIDAY;
            }
            case "SATURDAY" -> {
                this.lobbyPrice = LobbyPrice.SATURDAY;
            }
            case "SUNDAY" -> {
                this.lobbyPrice = LobbyPrice.SUNDAY;
            }
        }
    }
    /**
     *  to show the price per time in the day 
     */
    public void dayPriceDisplay(){
        switch (this.getThoiGian()) {
            case "MONDAY" -> {
                this.setLobbyPrice(LobbyPrice.MONDAY);
            }
            case "TUESDAY" -> {
                this.setLobbyPrice(LobbyPrice.TUESDAY);
            }
            case "WEDNESDAY" -> {
                this.setLobbyPrice(LobbyPrice.WEDNESDAY);
            }
            case "THURSDAY" -> {
                this.setLobbyPrice(LobbyPrice.THURSDAY);
            }
            case "FRIDAY" -> {
                this.setLobbyPrice(LobbyPrice.FRIDAY);
            }
            case "SATURDAY" -> {
                this.setLobbyPrice(LobbyPrice.SATURDAY);
            }
            case "SUNDAY" -> {
                this.setLobbyPrice(LobbyPrice.SUNDAY);
            }
        }
    }
    /**
     * TO SHOW THE INFORMATION OF THE LOBBY
     */
    public void displayLobby() {
        System.out.printf("\nMa sanh: %s || Ten sanh: %s || Vi tri sanh(tang): %d || Suc chua(ban): %d || Thu: %s",
                this.lobbyId, this.lobbyName, this.lobbyLocation, this.lobbyCapacity, this.getLobbyPrice());
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the lobbyId
     */
    public String getLobbyId() {
        return lobbyId;
    }

    /**
     * @param lobbyId the lobbyId to set
     */
    public void setLobbyId(String lobbyId) {
        this.lobbyId = lobbyId;
    }

    /**
     * @return the lobbyName
     */
    public String getLobbyName() {
        return lobbyName;
    }

    /**
     * @param lobbyName the lobbyName to set
     */
    public void setLobbyName(String lobbyName) {
        this.lobbyName = lobbyName;
    }

    /**
     * @return the lobbyLocation
     */
    public int getLobbyLocation() {
        return lobbyLocation;
    }

    /**
     * @param lobbyLocation the lobbyLocation to set
     */
    public void setLobbyLocation(int lobbyLocation) {
        this.lobbyLocation = lobbyLocation;
    }

    /**
     * @return the lobbyCapacity
     */
    public int getLobbyCapacity() {
        return lobbyCapacity;
    }

    /**
     * @param lobbyCapacity the lobbyCapacity to set
     */
    public void setLobbyCapacity(int lobbyCapacity) {
        this.lobbyCapacity = lobbyCapacity;
    }

    /**
     * @return the thoiGian
     */
    public String getThoiGian() {
        return thoiGian;
    }

    /**
     * @param thoiGian the thoiGian to set
     */
    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    /**
     * @return the lobbyPrice
     */
    public LobbyPrice getLobbyPrice() {
        return lobbyPrice;
    }

    /**
     * @param lobbyPrice the lobbyPrice to set
     */
    public void setLobbyPrice(LobbyPrice lobbyPrice) {
        this.lobbyPrice = lobbyPrice;
    }

}
