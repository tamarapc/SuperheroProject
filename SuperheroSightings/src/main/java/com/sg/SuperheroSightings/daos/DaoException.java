/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.SuperheroSightings.daos;

/**
 *
 * @author Tamara
 */
public class DaoException extends Exception{
    
    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message,
            Throwable cause) {
        super(message, cause);
    }
}