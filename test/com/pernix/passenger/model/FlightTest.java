/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.passenger.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián
 */
public class FlightTest {
    private Flight flight;
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        flight =  new Flight("FF4", "AIR", "20/11/2018", "RUSIA", "12:00:00",
                "COSTA RICA", "15:15:08",30);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addPassenger method, of class Flight.
     */
    @Test
    public void testAddPassengerNull() {
        PassengerTicket passenger = null;
        assertFalse(flight.addPassenger(passenger));
    }
    
    @Test
    public void testAddPassengerAlreadyInPassengers() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
        passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                "03:12:00");
        assertFalse(flight.addPassenger(passenger));
    }
    
    @Test
    public void testAddPassengerOutOfIndexNotAdd() {
        PassengerTicket passenger;
        for (int i = 0; i < 30; i++) {
            passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                    "03:12:00");
            flight.addPassenger(passenger);   
        }
        passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                "03:12:00");
        assertFalse(flight.addPassenger(passenger));
    }
    
        @Test
    public void testAddPassenger1() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
    }
    @Test
    public void testAddPassenger2() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
        
        passenger = new PassengerTicket("Juan", "12546649",
                "E12", "A23", "03:12:00");
        assertTrue(flight.addPassenger(passenger));

        passenger = new PassengerTicket("Juan", "846454648",
                "E12", "A24", "03:12:00");
        assertTrue(flight.addPassenger(passenger));        
    }
    
    /**
     * Test of removePassenger method, of class Flight.
     */
    
    @Test
    public void testRemovePassengerNotInPassengers() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        String passportCode = "123456";
        
        assertFalse(flight.removePassenger(passportCode));
    }
    
    @Test
    public void testRemovePassenger1() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        String passportCode = "123456789";
        assertTrue(flight.removePassenger(passportCode));
    }

    @Test
    public void testRemovePassenger2() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        String passportCode = "123456789";
        assertTrue(flight.removePassenger(passportCode));
    }
    
    @Test
    public void testRemovePassenger3() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "1234512329","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        String passportCode = "12345229";
        assertTrue(flight.removePassenger(passportCode));
    }
    
    /**
     * Test of countPassengers method, of class Flight.
     */
    @Test
    public void testCountPassengersWhileIsNotPassengers() {
        int expResult = 0;
        int result = flight.countPassengers();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountPassengers1() {
        int expResult = 0;
        int result = flight.countPassengers();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountPassengers2() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        int expResult = 1;
        int result = flight.countPassengers();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountPassengers3() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        int expResult = 2;
        int result = flight.countPassengers();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountPassengers4() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        flight.removePassenger("123456789");
        
        int expResult = 1;
        int result = flight.countPassengers();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInPassenger method, of class Flight.
     */
    
    @Test
    public void testCheckInPassengerNotInPassengers() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        assertFalse(flight.checkInPassenger("12345464"));
    }
    
    @Test
    public void testCheckInPassengerAlreadyCheckIn() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        flight.checkInPassenger("123456789");
        
        assertFalse(flight.checkInPassenger("123456789"));
    }
    
    @Test
    public void testCheckInPassenger1() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        assertTrue(flight.checkInPassenger("123456789"));
    }
    
    @Test
    public void testCheckInPassenger2() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        assertTrue(flight.checkInPassenger("12345229"));
    }
    
    @Test
    public void testCheckInPassenger3() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        flight.addPassenger(passenger);
        
        passenger = new PassengerTicket("Juan", "12345229","E12", "A23",
                "03:12:00");
        flight.addPassenger(passenger);
        
        assertTrue(flight.checkInPassenger("123456789"));
        assertTrue(flight.checkInPassenger("12345229"));
    }

    
}
