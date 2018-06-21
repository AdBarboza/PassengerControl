package com.pernix.passenger.model;

import java.util.Objects;


/**
 *
 * @author Adrián
 */
public class PassengerTicket {
    private String name;
    private String passportNumber;
    private String gate;
    private String seat;
    private String boardingTime;
    private boolean checkIn;

    public PassengerTicket() {
    }

    public PassengerTicket(String name, String passportNumber, String gate, String seat, String boardingTime) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.gate = gate;
        this.seat = seat;
        this.boardingTime = boardingTime;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }
    
    
    

}
