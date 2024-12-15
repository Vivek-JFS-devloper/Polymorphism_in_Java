package com.polymorphism;

public class Program1_2 {

    public static void main(String[] args) {

        Hai hai = new Hai();

        hai.m1();
        hai.m2(12);
        hai.m3();

    }
}

class Hello {

    void m1() {
        System.out.println("m1 in Hello");
    }

    void m2(int a) {
        System.out.println("m2 in Hello");
    }

    private void m3() {
        System.out.println("m3 in Hello");
    }

    protected int m4() {
        System.out.println("m4() in Hello");
        return 10;
    }
}

class Hai extends Hello {

    void m1() {
        System.err.println("m1 in Hai");
    }

    // int m2(int a) {
    // System.out.println("m2(int a) in Hai");
    // return 11;
    // }
    void m2(int a) {
        System.out.println("m2() in hai");
    }

    void m2(int a, int b) {
        System.out.println("m2(int a,int b)");
    }

    public void m3() {
        System.out.println("m2 in Hai");
    }

    // int m4() {
    //     System.out.println("m2 in Hai");
    // }
    public int m4() {
        System.out.println("m4 in Hai");
        return 33;
    }

    private void m5() {
        System.out.println("m5 in Hai");
    }
}
