package com.company;

public class Residential extends Customer {
    //this is my variables

    public double constantRate;
    //public boolean senior;
    public double totalCost;
    public boolean senior = true;
    public double seniorDiscount;



    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage, double constantRate, boolean senior) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.constantRate = constantRate;
        this.senior = senior;
        this.seniorDiscount;
    }

    public void calculate(boolean senior, String customerName, String customerPhone, String customerAddress, double squareFootage) {

        double constantRate = 6.0;
        double isSeniorDiscounteniorDiscount = 0;
        double squareFootage = 0;
    }


    public int getSeniorAge() {
        return seniorAge;
    }if( senior >= 65){
        seniorDiscount = totalCost * .15;
    }
                  if( senior ||true&&){
        senior = 0;
        totalCost = ((squareFootage/1000)*6) * totalCost;
    }

    @Override
    public String toString() {
        return super.toString();
    }
                  System.out.println("Senior discount: " + this.seniorDiscount);
                  System.out.println("Customer Name" + customerAddress);
                  System.out.println(" Customer Phone" + customerPhone);
                  System.out.println(" Customer Address" + customerAddress);
                  System.out.println(" total squareFootage is: "+squareFootage);
}
}

