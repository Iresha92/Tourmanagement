/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishk
 */
public class Bill {
     private String date;
    private String tourID;
    private int count;
    private String billID;

    Bill(String billID){
        this.setBillID(billID);
    }
    
    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }
}
