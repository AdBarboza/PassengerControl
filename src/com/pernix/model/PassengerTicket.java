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
    private Flight flight;
    private String gate;
    private String seat;
    private String date;
    private String boardingTime;
    private String departingTime;

    public PassengerTicket() {
    }

    public PassengerTicket(String name, Flight flight, String gate, String seat, String date, String boardingTime, String departingTime) {
        this.name = name;
        this.flight = flight;
        this.gate = gate;
        this.seat = seat;
        this.date = date;
        this.boardingTime = boardingTime;
        this.departingTime = departingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getDepartingTime() {
        return departingTime;
    }

    public void setDepartingTime(String departingTime) {
        this.departingTime = departingTime;
    }

    @Override
    public String toString() {
        return "Passenger{" + "name=" + name + ", flight=" + flight + ", gate=" + gate + ", seat=" + seat + ", date=" + date + ", boardingTime=" + boardingTime + ", departingTime=" + departingTime + '}';
    }
    
    
}
