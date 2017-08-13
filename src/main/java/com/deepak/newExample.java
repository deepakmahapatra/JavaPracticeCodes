package com.deepak;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class newExample {



        public static void main(String[] args){
            List<you> pop= Arrays.asList(
                    new you("xa", "yd", 20),
                    new you("a", "b", 29),
                    new you("c", "d", 37),
                    new you("e", "y", 16)
            );


        Collections.sort(pop, (you o1, you o2)->o1.getAge() - o2.getAge());

            printAl(pop);
            Collections.sort(pop, (you o1, you o2)->o1.getFname().compareTo(o2.getFname()) );

            printAl(pop);

        pop.stream()
                .filter(p->p.getFname().toLowerCase().startsWith("a"))
                .forEach(p-> System.out.println(p.getAge()));

        }
    public static void printAl(List<you> x){
        for (you i : x){
            System.out.println(i);

        }
    }
    }

