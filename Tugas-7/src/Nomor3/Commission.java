/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

/**
 *
 * @author angga
 */
public class Commission extends Hourly {
    
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, 
            String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales (double totalSales){
        this.setTotalSales(totalSales);
    }
    
    @Override
    public double pay(){
        double payment = super.pay() + 
                (this.totalSales * this.getCommissionRate()); 
        this.totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTotal Sales: " + getTotalSales();
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
}
