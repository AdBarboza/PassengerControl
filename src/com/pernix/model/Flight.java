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
public class Flight {
    private String pilotName;
    private String airline;
    private String date;
    private String destination;
    private String arriveTime;
    private String origin;
    private String departingTime;

    public Flight() {
    }

    public Flight(String pilotName, String airline, String date, String destination, String arriveTime, String origin, String departingTime) {
        this.pilotName = pilotName;
        this.airline = airline;
        this.date = date;
        this.destination = destination;
        this.arriveTime = arriveTime;
        this.origin = origin;
        this.departingTime = departingTime;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDepartingTime() {
        return departingTime;
    }

    public void setDepartingTime(String departingTime) {
        this.departingTime = departingTime;
    }
    
    
}
