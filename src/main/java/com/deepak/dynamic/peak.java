package com.deepak.dynamic;

import java.util.Arrays;
import java.util.Random;

public class peak {
    int length;
    public int[] inputarray=new int[length];

    public peak(int[] inputarray,int length) {
        this.length=length;
        this.inputarray = inputarray;
    }


    public void peakfinder(int[] array) {
        if (this.inputarray[0]>this.inputarray[1]){
            System.out.println("One Peak is "+this.inputarray[0]);
            return;
        }
        if (this.inputarray[this.length-2]<this.inputarray[this.length-1]){
            System.out.println("One Peak is "+this.inputarray[this.length-1]);
            return;
        }
        int length = array.length;
        int mid=(int)Math.ceil(length/2.0);
        System.out.println("mid value is"+mid+"\n mid is"+array[mid-1]);
        System.out.println("Length is " + length);


        if (length == 2) {
            if (array[0] < array[1]) {
                System.out.println("peak is" + array[1]);
//                return;

            } else {
                System.out.println("peak is" + array[0]);
//                return;

            }
        }
        if (length > 2) {
            if (array[mid-1] < array[(mid-1) - 1]) {
                int[] array1 = Arrays.copyOfRange(array, 0, (mid-1) );
                System.out.println("Array 1");
                for (int i : array1) {
                    System.out.print(i + " ");
                }
                if(array1.length>1){
                if(array1[mid-2]>array1[mid-3]){
                    System.out.println("Peak is "+array1[mid-2]);
                }}
                peakfinder(array1);
            } else if (array[mid-1] < array[(mid-1) + 1]) {
                int[] array2 = Arrays.copyOfRange(array, (mid-1) + 1, length );
                System.out.println("Array 2");
                for (int i : array2) {
                    System.out.print(i + " ");
                }
                if(array2.length>1){
                if(array2[0]>array2[1]){
                    System.out.println("Peak is "+array2[0]);
                }}
                peakfinder(array2);

            } else {
                System.out.println("peak is" + array[mid-1]);
//                return;
            }

        }
    }


    public static void main(String[] args){
        int[] arraya=new int[]
        {6, 32,
                20,
                31,
                33,
                35,
                69,
                89,
                91,
                24
        };
//        for(int i=0;i<arraya.length;i++)
//        {
//            Random rand = new Random();
//            arraya[i]=rand.nextInt(100);
//        }
        for (int i:arraya){
            System.out.print(i+" ");
        }
        System.out.println("\n *********");
        peak newpeak=new peak(arraya,10);
        newpeak.peakfinder(arraya);
    }
}
