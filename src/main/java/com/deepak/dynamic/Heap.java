package com.deepak.dynamic;

import java.util.Random;

public class Heap {


    public int[] maxHeapSort(int[] array2){
        int n=array2.length;
        int[] array=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            array[i]=array2[0];
            temp=array2[n-1-i];
            array2[n-1]=array2[0];
            array2[0]=temp;
            array2=maxHeap(array2,n-i-1);
//            for (int j:array2){
//                System.out.print(j+" ");
//            }
//            System.out.println("\n");

        }
//        for (int k=0;k<n;k++)
//            System.out.println(k);

        return array;
    }

    public int[] maxHeap(int[] array, int length){

        int n=length;
        for(int i=(n/2)-1;i>=0;i--){
//            System.out.println(i);
            array=maxHeapify(array,i,n);
        }
        return array;
    }

    public int[] maxHeapify(int[] array,int index, int n){

         {
            int leftindex = 2 * index+1;
            int rightindex = 2 * index +2;
            int temp = 0;
            if(leftindex<n&&rightindex<n){
            if (array[leftindex] > array[rightindex] ) {
                if (array[index] < array[leftindex]) {
                    temp = array[index];
                    array[index] = array[leftindex];
                    array[leftindex] = temp;
                    maxHeapify(array, leftindex,n);
                }
            } else {
                if (array[index] < array[rightindex]) {
                    temp = array[index];
                    array[index] = array[rightindex];
                    array[rightindex] = temp;
                    maxHeapify(array, rightindex,n);

                }
            }

            }
         }

        return array;

    }

    public static void main(String[] args){
        int[] array1=new int[21];
        Random rand=new Random();
        for (int i=0;i<array1.length;i++){
            array1[i]=rand.nextInt(100);
            System.out.print(array1[i]+ " ");
        }
        Heap heap1=new Heap();
        array1=heap1.maxHeap(array1,array1.length);
        System.out.println("Heapified");
        for (int i:array1){
            System.out.print(i+ " ");
        }
        array1=heap1.maxHeapSort(array1);
        System.out.println("Sorted");
        for (int i:array1){
            System.out.print(i+ " ");
        }
    }

}


