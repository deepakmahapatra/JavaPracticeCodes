package com.deepak.dynamic;

import java.util.HashMap;


public class fibonnacu {
    private HashMap<Integer,Integer> resultmap=new HashMap<Integer,Integer>();
    public Integer findfibo(int n) {
        Integer f = 0;

        f = resultmap.get(n);
        System.out.println("F value is " + f);
        if (f != null) {
            return f;
        }
        if (n == 2 | n == 1) {
            return 1;
        } else if (n > 2) {

            f = findfibo(n - 1) + findfibo(n - 2);
            resultmap.put(n, f);
        }
        return f;
    }

    public Integer findfibofor(int n){

        int[] fib=new int[n+1];
        for (int i=0;i<n+1;i++){
            fib[i]=0;
        }
        for (int i=0;i<=n;i++){
            if (i==1 |i==2){
                fib[i]=1;
            }
            else  if (i>2){
                fib[i]=fib[i-1]+fib[i-2];
            }
        }

        return fib[n];

    }
    public static void main(String[] args){
        int f=11;
        fibonnacu fibo=new fibonnacu();
        Integer result=fibo.findfibofor(f);
        System.out.println(result);
    }
}
