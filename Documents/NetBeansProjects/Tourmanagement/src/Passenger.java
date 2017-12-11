/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishk
 */
public class Passenger {
    public String name;
    public String preferences;
    public int contact;
    public String address;
    public String dateOfBirth;
    public String gender;

    Passenger(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    
     public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public int registerTour(int tourID){
        System.out.println("I would like to place a booking for this "+tourID +" tour");
        return tourID;
    }
    
    public boolean payment(String billID){
        System.out.println("Payment done for "+billID+" bill");
        return true;
    }
}
