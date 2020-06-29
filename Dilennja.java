package com.company;

public class Dilennja extends Zminni implements Action {
   public void divi(){
       System.out.println( (a / b) + (a % b));
   }

    @Override
    public double action(double a, double b) {
        return (a / b) ;
    }
}
