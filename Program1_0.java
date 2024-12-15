package com.polymorphism;

public class Program1_0 {

    public static void main(String[] args) {
        Hai hai1 = new Hai();//is ok sourse and destination both are of same type
        Hello h1 = new Hello();//is ok  sourse and destination both are same type.
        Hai hai2 = new Hello();//super and sub relationship

        //  Hello h2 = new Hai();//hai cannot be convertate to Hello type
        // Hello h2 = (Hello) new Hai();//java.lang.ClassCastException
        Hai hai3 = hai1;
        Hai hai4 = h1;
        Hai hai5 = hai2;
        // Hello h3 = (Hello) hai1;//java.lang.ClassCastException

        Hello h4 = h1;
        Hello h5 = (Hello) hai2;
        /*
          int this case of h3 and h5 both sourse is of super type itself but after typecasting in case of h5 it is not giving any error or exception where as in case of h3 it is giveing exception at a runtime that is java.lang.ClassCastExceaption why?
          1.in case of h3 sourse is a super type itself hai1.
            if super-class ref variable contain superclass object ref. then can not be type caste to sub class ref.variable.
          2.if super-class ref variable contain sub-class object ref. then we can typecast to the conpatible type cast. 
         */
        //=========================================================

        Any any = new Any();
        int i = any.m12();
        System.out.println("" + i);
        Hai haii = any.m13();

        haii.m1();
    }
}

class Hai {

    void m1() {
        System.out.println("m1 in Hai ");
    }
}

class Hello extends Hai {

    void m2() {
        System.out.println("m2() in Hello class");
    }
}

class C {
}

class Any {

    void m11() {
        System.out.println("m11 in inside any classs");
    }

    int m12() {
        System.out.println("m12 in insde any class ");

        return 100;
    }

    Hai m13() {
        System.out.println("m13 in any class");
        return new Hai();
    }

    Hai m14() {
        System.out.println("m14 in any class");
        return new Hello();
    }

    Hello m15() {
        System.out.println("m15 in any class");
        return new Hello();
    }

    Hello m19() {
        System.out.println("m19 in any class");

        return (Hello) m14();
    }
}
