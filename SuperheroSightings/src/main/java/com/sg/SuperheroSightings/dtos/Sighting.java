/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.SuperheroSightings.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Tamara
 */
public class Sighting {
    
    private int id;
    private Location location;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private List<Supe> supers = new ArrayList();

    
    public boolean supersPerSighting(int superId){
        return supers.stream().anyMatch(s -> s.getId() == superId);
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the supers
     */
    public List<Supe> getSupers() {
        return supers;
    }

    /**
     * @param supers the supers to set
     */
    public void setSupers(List<Supe> supers) {
        this.supers = supers;
    }
    
    
}
