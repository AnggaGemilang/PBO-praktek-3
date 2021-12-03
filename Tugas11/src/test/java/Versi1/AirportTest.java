/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Versi1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author angga
 */
public class AirportTest {
    
    private Flight businessFlight, economyFlight;

    @Before
    public void setUp() throws Exception {
        economyFlight = new Flight("1", "Economy");
        businessFlight = new Flight("2", "Business");
    }

    @Test
    public void testEconomyFlightRegularPassenger() {
        Passenger mike = new Passenger("Mike", false);
        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(mike));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("Mike",
        economyFlight.getPassengersList().get(0).getName());
        assertEquals(true, economyFlight.removePassenger(mike));
        assertEquals(0, economyFlight.getPassengersList().size());
    }

    @Test
    public void testEconomyFlightVipPassenger() {
        Passenger james = new Passenger("James", true);
        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("James",
        economyFlight.getPassengersList().get(0).getName());
        assertEquals(false, economyFlight.removePassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightRegularPassenger() {
        Passenger mike = new Passenger("Mike", false);
        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightVipPassenger() {
        Passenger james = new Passenger("James", true);
        assertEquals(true, businessFlight.addPassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
    }
        
}
