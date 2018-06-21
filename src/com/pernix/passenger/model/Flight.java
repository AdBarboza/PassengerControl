package com.pernix.passenger.model;

import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public class Flight {
    private String flightCode;
    private String airline;
    private String date;
    private String destination;
    private String arriveTime;
    private String origin;
    private String departingTime;
    private int capacity;
    private ArrayList<PassengerTicket> passengers; 
    
    public Flight() {
    }

    public Flight(String flightCode, String airline, String date, String destination, String arriveTime, String origin, String departingTime, int capacity) {
        this.flightCode = flightCode;
        this.airline = airline;
        this.date = date;
        this.destination = destination;
        this.arriveTime = arriveTime;
        this.origin = origin;
        this.departingTime = departingTime;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }
    
    public boolean addPassenger(PassengerTicket passenger){
        if(passenger == null){
            return false;
        }
        for (PassengerTicket p : passengers) {
            if(p.getPassportNumber().equals(passenger.getPassportNumber())){
                return false;
            }
        }
        if(passengers.size()<capacity){
            this.passengers.add(passenger);
            return true;
        }
        return false;
    }
    
    public boolean removePassenger(String passportCode){
        for (PassengerTicket passenger : passengers) {
            if(passenger.getPassportNumber().equals(passportCode)){
                passengers.remove(passenger);
                return true;
            }
        }
        return false;
    }
    
    public int countPassengers(){
        return passengers.size();
    }
    
    public boolean checkInPassenger(String passportCode){
        for (PassengerTicket passenger : passengers) {
            if(passenger.getPassportNumber().equals(passportCode)){
                passenger.setCheckIn(true);
                return true;
            }
        }
        return false;
    }
    
    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
}
