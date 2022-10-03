/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.unikl.se;

/**
 *
 * @author MIIT
 */
public class Student {
    
    private String fullname;
    private String ID;
    
    public Student(String fullname, String ID){
        
        this.fullname=fullname;
        this.ID = ID;
    }
    
    public void DisplayInfo(){
      System.out.println(fullname);
      System.out.println(ID);
    }
    
}
