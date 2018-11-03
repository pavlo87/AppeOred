package com.AppleOrder;

public interface Order  {
    public static void main(String[] args) {
        System.out.println(calculateTotalPrice(2,12));
        System.out.println(calculateTotalPrice(0.75,6));

    }
        static int calculateTotalPrice ( int quantity, int prise){
            return quantity * prise;
        }
        static double calculateTotalPrice ( double weight, int prise){
            return weight * prise;
        }

}
