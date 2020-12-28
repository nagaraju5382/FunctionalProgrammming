package com.company.fp;

import java.util.function.Function;

public class FunctionalInterfaceAssignment {

    public static class MyMath{
        public static Integer triple(Integer x){
            return  x*3;
        }
    }

    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(4);
        System.out.println("Triple of 4 is : "+ result);
    }
}
