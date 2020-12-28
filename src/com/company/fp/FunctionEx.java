package com.company.fp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionEx {
    Function<Integer,Integer> multiplyThreeTimes = (x)->{ return x*3; };

    BiFunction<Integer,Integer,Integer> multiplyTwoNumber = (x, y) -> {return x*y ;};

    BinaryOperator<Integer> ss = (xe,yw)-> xe + yw   ;

    UnaryOperator<Integer> uo = (uo)->uo+4;



    public static void main(String[] args) {
        FunctionEx dd = new FunctionEx();
        System.out.println("3 times of a number is "+dd.multiplyThreeTimes.apply(3));
        System.out.println("Multiplication of two number is: "+dd.multiplyTwoNumber.apply(4,5));
        System.out.println("Sum of two numbers is "+dd.ss.apply(3,2));
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        integerList.forEach(x->System.out.println(dd.uo.apply(x)));
        //integerList.forEach(System.out::println);


    }
}
