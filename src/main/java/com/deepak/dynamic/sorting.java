package com.deepak.dynamic;

import java.util.Arrays;
import java.util.Random;

public class sorting {
    public int length;
    public int[] array=new int[length];



    public  sorting(int[] array){

        this.array=array;

    }
    public int[] mergesort(int[] array){
        int length=array.length;
        if (length>2){
            int[]left=Arrays.copyOfRange(array,0,length/2);
            int[]right=Arrays.copyOfRange(array,length/2,length);
            left=mergesort(left);
            right=mergesort(right);
            int leftindex=0,rightindex=0;
            int i=0;
            while(leftindex<left.length || rightindex<right.length){
                if(leftindex<left.length && rightindex<right.length) {
                    if (left[leftindex] < right[rightindex]) {
                        array[i] = left[leftindex];
                        leftindex++;
                        i++;
                    } else {
                        array[i] = right[rightindex];
                        rightindex++;
                        i++;
                    }
                }
                else if(leftindex<left.length){
                    array[i]=left[leftindex];
                    leftindex++;
                    i++;
                }
                else if(rightindex<right.length){
                    array[i]=right[rightindex];
                    rightindex++;
                    i++;
                }
            }
        }

        if(length==2){
            if(array[0]>array[1]){

                int temp=array[1];
                array[1]=array[0];
                array[0]=temp;

            }
            return array;
        }
        return array;
    }

    public int[] insertionSort(int[] array){

        int length=array.length;
        int temp=0;
        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if(array[i]>array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public int binaryseacrh(int[] array,int element){
        int position= 0;
        int length=array.length;
        if(element<array[length/2]){
            int[] subarray= Arrays.copyOfRange(array, 0, (length/2-1));
            binaryseacrh(subarray,element);
        }
        if(element>array[length/2]){
            int[] subarray= Arrays.copyOfRange(array, length/2, (length));
            binaryseacrh(subarray,element);
        }
        if(element==array[length/2]){
            position= length/2;
        }

        return position;
    }

    public static void main(String[] args){
        int[] array1=new int[20];

        for(int i=0;i<array1.length;i++){
            Random rand=new Random();
            array1[i]=rand.nextInt(500);
        }
        System.out.println("UNSorted String is");
        for (int i :array1){
            System.out.print(i+" ");
        }
        sorting sorted=new sorting(array1);
        int array2[]=new int[array1.length];
        array2=sorted.mergesort(array1);
        System.out.println("\n Merge Sorted String is");
        for (int i :array1){
            System.out.print(i+ " ");
        }



        array1=sorted.insertionSort(array1);
        System.out.println("\n Insertions Sorted String is");
       for (int i :array1){
           System.out.print(i+ " ");
       }

    }

}
