/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121_part1;

/**
 *
 * @author Boitumelo ST10447349
 */
public class Login { 
    
    private String name;
    private String surname;
    private String phoneNumber;
    private String username;
    private String password;
    
    
    public Login(String name, String surname, String phoneNumber, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        
            public boolean checkusername() {
            if (username.contains("_") && username.length() <= 5) {
                return true;
            } else {
                return false;
            } 
            public boolean checkPasswordComplexity() {
                boolean hasNumber = false;
                boolean hasSpecial = false;
                boolean hasCapital = false; 
                
                if (password.length() >=8) {
                    for (int i = 0; i < password.length(); i++) {
                        char ch = password.charAt(i);
                        
                        if (Character.isUpperCase(ch)) {
                        
                       if (Character.isDigit(ch)) {
                            hasNumber = true;
                        }    
                    }   if (!Character.isLetterOrDigit(ch)) {
                            hasSpecial = true;
                        }    
                   }
                   if (hasCapital && hasNumber && hasSpecial) {
                        return true;
                   }
                }
                return false;
            }
        }
         
      
    
            
    
           
            
        
         
      
    
            
    

