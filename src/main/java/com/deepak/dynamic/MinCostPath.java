package com.deepak.dynamic;

public class MinCostPath {

    public static int  min(int a, int b, int c){
        if (a<b && a<c) return a;
        if(b<a && b<c) return b;
        else return c;

    }


    public static int minPath(int[][] a, int m, int n){
        if(m==0 && n==0){
            return a[m][n];
        }
        if(m==0 && n!=0){
            int temp=0;
            for(int i=0;i<=n;i++){
                temp=temp+a[m][i];

            }
            return temp;
        }
        if(m!=0 && n==0){
            int temp=0;
            for(int i=0;i<=m;i++){
                temp=temp+a[i][n];

            }
            return temp;
        }

        else{
            return a[m][n]+min(minPath(a,m-1,n),minPath(a,m,n-1),minPath(a,m-1,n-1));
        }



    }

    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " +
                minPath(cost,2,2));
    }
}
