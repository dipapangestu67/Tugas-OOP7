/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StripBandunk.BelajarMewarisiInterface.Data;

/**
 *
 * @author iipsu
 */
public class Manusia implements Makan, Minum{

    @Override
    public void makan() {
       System.out.println("Makan");
    }

    @Override
    public void minum() {
     System.out.println("Minum");   
    }
    
}
