/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.unikl.se;

/**
 *
 * @author MIIT
 */
public class Temperature {
    public double celcius;
    public double maxTemp;
    
    public Temperature(){
        
    }
    
    public Temperature (double celcius){
        this.celcius=celcius;
        this.maxTemp=celcius;
    }
    public double convertCelToFah(){
        return (9*celcius+160)/5;
    }
    
    public void displayMessage(){
        if(maxTemp>=100){
            System.out.println("boiling");
        }else if(maxTemp>=40&&maxTemp<100){
            System.out.println("Hot");
        }else if(maxTemp>0&&maxTemp<40){
            System.out.println("cold");
        }else if(maxTemp<0){
            System.out.println("Freezing");
        }
    }
    
   
}
