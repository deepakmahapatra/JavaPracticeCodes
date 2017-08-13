package com.deepak.dynamic;

public class LongestCommonSubsequence {

    /* A Naive recursive implementation of LCS problem in java*/

        /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
        int lcs( char[] X, char[] Y, int m, int n )
        {
           if(m==0 || n==0){
               return 0;
           }


           if (X[m-1]==Y[n-1]) {
               return (1 + lcs(X, Y, m - 1, n - 1));
           }
           else {
               return  max(lcs(X,Y,m-1,n),lcs(X,Y,m,n-1));
           }


        }

        int lcsmulti(char[] X,char[] Y,int m, int n){
            int L[][]=new int[m+1][n+1];
            for(int i=0;i<=n;i++){
                for (int j=0;j<=m;j++){
                    if(i==0 || j==0){
                        L[i][j]=0;
                    }
                    else if (X[i-1]==Y[j-1]){
                        L[i][j]=L[i-1][j-1]+1;
                    }
                    else{
                        L[i][j]=max(L[i-1][j], L[i][j-1]);
                    }
                }
            }
            return L[m][n];
        }



        /* Utility function to get max of 2 integers */
        int max(int a, int b)
        {
            return (a > b)? a : b;
        }

        public static void main(String[] args)
        {
            LongestCommonSubsequence lcs = new LongestCommonSubsequence();
            String s1 = "AAGGTAB";
            String s2 = "GXTXAYB";

            char[] X=s1.toCharArray();
            char[] Y=s2.toCharArray();
            int m = X.length;
            int n = Y.length;

            System.out.println("Length of LCS is" + " " +
                    lcs.lcsmulti( X, Y, m, n ) );
        }

    }
