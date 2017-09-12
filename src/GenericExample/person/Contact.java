/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericExample.person;

/**
 *
 * @author Producer
 */
public class Contact {

    String salutation;
    String fName;
    String lName;
    String phoneNumber;

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String salutation, String fName, String lName, String phoneNumber) {
        this.salutation = salutation;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }
     @Override
    public String toString() {
        return "Contact Info: "+salutation+". "+lName+" "+phoneNumber;
    }
    
}
