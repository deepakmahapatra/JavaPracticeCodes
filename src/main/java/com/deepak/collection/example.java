package com.deepak.collection;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class example {
    List<Integer> values=new ArrayList<>();
    public void adding(Integer i,Integer j){
        values.add(i,j);
    }
    public void sortValues(List<Integer> val){
        val.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
    }



    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        example value1=new example();

        for (Integer i=0;i<50;i++)
        {
            value1.adding(i,i);

        }
        for (Integer i=50;i<100;i++)
        {
            value1.adding(i,i-100);

        }
        for (int i : value1.values){
            System.out.println(i);
            //System.out.println("\n");
        }
        value1.sortValues(value1.values);

        System.out.println("Sorted Values are");
        for (int i : value1.values){
            System.out.println(i);
            //System.out.println("\n");
        }
    }
}
