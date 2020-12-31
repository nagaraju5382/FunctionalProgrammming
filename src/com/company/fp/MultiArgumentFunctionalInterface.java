package com.company.fp;

public class MultiArgumentFunctionalInterface {
    public static void main(String[] args) {
        MultiArgumentFunctionalInt<Integer,Integer,Integer,Integer> rr= (t,u,v)-> t +  u+ v;
        System.out.println(rr.apply(3,4,5));

        NoArgInterface<String> ss = () -> "Hello";
        System.out.println(ss.apply());
    }
}
