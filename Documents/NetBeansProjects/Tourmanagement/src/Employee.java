/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishk
 */
public class Employee {
    public String name;
    private String empCode;
    private int contact;
    private String address;

    Employee(String name){
        this.setName(name);
        this.setEmpCode(empCode);
    }
    Employee(){
        this("");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
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
}
