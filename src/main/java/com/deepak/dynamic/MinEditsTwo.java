package com.deepak.dynamic;

public class MinEditsTwo {

    public static int min(int a, int b, int c){

        if(a<b && a<c) return a;
        if(b<c && b<a) return b;
        else return c;
    }

    public static int changeString(char[] A,char[] B, int m,int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(A[m-1]==B[n-1]){
            return changeString(A,B,m-1,n-1);
        }
        return 1+min(changeString(A,B,m,n-1),changeString(A,B,m-1,n),changeString(A,B,m-1,n-1));



    }


    public static void main(String args[])
    {
        String str1 = "sunday";
        String str2 = "saturday";
        char[] X=str1.toCharArray();
        char[] Y=str2.toCharArray();

        System.out.println( changeString( X , Y , str1.length(), str2.length()) );
    }
}
