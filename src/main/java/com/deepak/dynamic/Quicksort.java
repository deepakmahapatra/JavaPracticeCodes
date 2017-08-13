package com.deepak.dynamic;

public class Quicksort {

    public int[] quicksort(int[]a,int start, int end){
        int pivot;
        if(start<end){

            pivot=pivoting(a,start,end);
            a=quicksort(a,start,pivot-1);
            a=quicksort(a,pivot+1,end);

        }

        return a;
    }
    public  int pivoting(int[] a,int start,int end){
        int pivot=start;
        for(int i=start;i<end;i++){
            if(a[i]<=a[end]){
                int temp=a[pivot];
                a[pivot]=a[i];
                a[i]=temp;
                pivot++;
            }

        }

        int temp=a[end];
        a[end]=a[pivot];
        a[pivot]=temp;
        return pivot;
    }
    public static void main(String[] args){
        int[] array=new int[]{1,3,4,5,2,6,99,55,34,2};
        Quicksort quick=new Quicksort();
        array=quick.quicksort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }




    }
}
