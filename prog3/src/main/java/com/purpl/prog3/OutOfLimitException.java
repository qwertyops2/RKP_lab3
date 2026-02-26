/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.purpl.prog3;

/**
 *
 * @author izada
 */
public class OutOfLimitException extends Exception {
    private double number;
    public double getNumber(){return number;}
    public OutOfLimitException(String message, double num){
        super(message);
        number = num;
    }
}
