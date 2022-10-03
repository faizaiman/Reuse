/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.unikl.se.test;

import my.unikl.se.Temperature;

/**
 *
 * @author MIIT
 */
public class TemperatureTest {
    public static void main(String[] args)
    {
    Temperature t1 = new Temperature(1);
    Temperature t2 = new Temperature(100);
    
System.out.println("The temperature of "+t1.celcius+" celcius is  equivalent to "+t1.convertCelToFah()+" fahrenheit.");
t1.displayMessage();
System.out.println("The temperature of "+t2.celcius+" celcius is equivalent to "+t2.convertCelToFah()+" fahrenheit"+t2);
t2.displayMessage();
    
    }

}
