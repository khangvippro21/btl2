/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.Lobby;

/**
 *
 * @author DELL
 */
public enum LobbyPrice {
    MONDAY(40000, 500000, 60000) {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("\n-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.MONDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    TUESDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.TUESDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    WEDNESDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.WEDNESDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    THURSDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.THURSDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    FRIDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.FRIDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    SATURDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.SATURDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    },
    SUNDAY {
        @Override
        public void inputPrice() {
            System.out.print("Nhap gia buoi SANG: ");
            this.morningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi CHIEU: ");
            this.eveningPrice = PublicFunc.SC.nextDouble();
            System.out.print("Nhap gia buoi TOI: ");
            this.nightPrice = PublicFunc.SC.nextDouble();
        }

        @Override
        public void displayPrice() {
            System.out.printf("-%s- "
                    + "\nMorning: %.1f"
                    + "\nEvening: %.1f"
                    + "\nNight: %.1f",
                    this.SUNDAY, this.morningPrice, this.eveningPrice, this.nightPrice);
        }
    };

    protected double morningPrice;
    protected double eveningPrice;
    protected double nightPrice;

    private LobbyPrice() {
    }
    
    private LobbyPrice(double morning, double evening, double night) {
        this.morningPrice = morning;
        this.eveningPrice = evening;
        this.nightPrice = night;
    }

    public abstract void inputPrice();

    public abstract void displayPrice();

    /**
     * @return the morningPrice
     */
    public double getMorningPrice() {
        return morningPrice;
    }

    /**
     * @param morningPrice the morningPrice to set
     */
    public void setMorningPrice(double morningPrice) {
        this.morningPrice = morningPrice;
    }

    /**
     * @return the eveningPrice
     */
    public double getEveningPrice() {
        return eveningPrice;
    }

    /**
     * @param eveningPrice the eveningPrice to set
     */
    public void setEveningPrice(double eveningPrice) {
        this.eveningPrice = eveningPrice;
    }

    /**
     * @return the nightPrice
     */
    public double getNightPrice() {
        return nightPrice;
    }

    /**
     * @param nightPrice the nightPrice to set
     */
    public void setNightPrice(double nightPrice) {
        this.nightPrice = nightPrice;
    }

}
