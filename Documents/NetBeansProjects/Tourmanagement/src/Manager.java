/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ishk
 */
public class Manager extends Employee{

    public Driver driver;
    public Route route;
    public Tour tour;
    public Bill bill;

    public void assignRoute(Route route) {
        this.route = route;
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public void reserveTour(Tour tour) {
        this.tour = tour;
    }
    public void createBill(Bill bill) {
        this.bill = bill;
    }
 



}
