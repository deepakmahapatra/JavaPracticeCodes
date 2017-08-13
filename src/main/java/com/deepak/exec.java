package com.deepak;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exec {
    public static void main(String[] args){
        int a=10;
        List<you> pop= Arrays.asList(
                new you("xa", "yd", 20),
                new you("a", "b", 29),
                new you("c", "d", 37),
                new you("e", "y", 16)
        );


//        Collections.sort(pop, new Comparator<you>() {
//            @Override
//            public int compare(you o1, you o2) {
//
//                return o1.getAge()-o2.getAge();
//            }
//        });


        condSort(pop, new Condition() {
            @Override
            public void test(List<you> pop) {
                Collections.sort(pop, new Comparator<you>() {
                    @Override
                    public int compare(you o1, you o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });

            }
        });

        System.out.println("Ordering by age");
        printAll(pop);
        condSort(pop, new Condition() {
            @Override
            public void test(List<you> pop) {
                Collections.sort(pop, new Comparator<you>() {
                    @Override
                    public int compare(you o1, you o2) {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                });

            }
        });
        System.out.println("Ordering by name");
        printAll(pop);




    }
    public static void condSort(List<you> x, Condition c){

        c.test(x);


    }

    public static void printAll(List<you> x){
        for (you i : x){
            System.out.println(i);

        }
    }
}

interface Condition {

        void test(List<you> x);
    }