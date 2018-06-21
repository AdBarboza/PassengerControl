/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.model;


/**
 *
 * @author Adrián
 */
public class PassengerTicket {
    private String name;
    private String passportNumber;
    private Flight flight;
    private String gate;
    private String flightClass;
    private String seat;
    private String boardingTime;

    public PassengerTicket() {
    }

    public PassengerTicket(String name, String passportNumber, Flight flight, String gate, String flightClass, String seat, String boardingTime) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.flight = flight;
        this.gate = gate;
        this.flightClass = flightClass;
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
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
        
}
