/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121_part1;

/**
 *
 * @author lab_services_student
 */
public class Login { 
    
    private String name;
    private String surname;
    private String phonenumber;
    private String username;
    private String password;
    
    
    public Login(String name, String surname, String phonenumber, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
        
            public boolean checkusername() {
            if (username.contains("_") && username.length() <= 5) {
                return true;
            } else {
                return false;
            }
        }
         
    }   
    
            
    

