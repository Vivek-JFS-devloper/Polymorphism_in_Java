package com.polymorphism;

interface Payment {

    void makePayment();
}

class CreditCard implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class PayPal implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment made using PayPal");
    }
}

class GooglePay implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment made using Google Pay");
    }
}

public class PaymentApp {

    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.makePayment(); // Output: Payment made using Credit Card

        payment = new PayPal();
        payment.makePayment(); // Output: Payment made using PayPal

        payment = new GooglePay();
        payment.makePayment(); // Output: Payment made using Google Pay
    }
}
