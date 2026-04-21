*/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/ 


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
    }    
            public boolean checkUsername() {
            if (username.contains("_") && username.length() <= 5) {
                return true;
            } else {
                return false;
            }
            }    
            public boolean checkPasswordComplexity() {
                boolean hasNumber = false;
                boolean hasSpecial = false;
                boolean hasCapital = false; 
                
                if (password.length() >=8) {
                    for (int i = 0; i < password.length(); i++) {
                        char ch = password.charAt(i);
                        
                        if (Character.isUpperCase(ch)) {
                            hasCapital = true;
                        }    
                        
                       if (Character.isDigit(ch)) {
                            hasNumber = true;
                        }    
                       if (!Character.isLetterOrDigit(ch)) {
                            hasSpecial = true;
                        }    
                   }
                   if (hasCapital && hasNumber && hasSpecial) {
                        return true;
                   }
                }
                return false;
                }
}           //South African international phone numbers begin with +27 followed by 9 digits
            //Format referenced from KrispCall inernational numbering guide (2025)
            //https://krispcall.com/phone-numbers/international-phone-number-format/
            //Accessed:15 April 2025

                public boolean checkCellPhoneNumber(){
                    if (phoneNumber.length() != 12 ){
                        return false;
                    }
                    if (!phoneNumber.startsWith("+27")) {
                        return false;
                    }
                    for (int i = 3; i < phoneNumber.length(); i++) {
                        
                        if (!Character.isDigit(phoneNumber.charAt(i))){
                            return false;
                        }
                    }
                    return true;
                }   
                public String registerUser() {
                    if ( !checkUsername ()) {
                        return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters";
                    }
                    if ( !checkPasswordComplexity ()) {
                        return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and special character";
                    }
                    return "User registered successfully";
                }
                
                public boolean loginUser(String enteredUsername, String enteredPassword) {
                    return enteredUsername.equals(Username) && enteredPassword.equals(Password);    
                }
                


                  
                
                
            
    
           
            
        
         
      
    
            
    

