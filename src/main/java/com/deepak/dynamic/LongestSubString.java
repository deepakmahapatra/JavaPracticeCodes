package com.deepak.dynamic;

public class LongestSubString {
    static final int NO_OF_CHARS = 256;


    public static int computeLongestString(String a){
        int[] visited=new int[NO_OF_CHARS];
        int cur_lenght=1,max_index=1;
        int prev_index=0;
        for(int i=0;i<NO_OF_CHARS;i++){
            visited[i]=-1;
        }
        visited[a.charAt(0)]=0;
        for(int i=1;i<a.length();i++){
            prev_index=visited[a.charAt(i)];
            if(prev_index==-1 || (i-cur_lenght) >prev_index){
                cur_lenght++;
            }
            else{
                if(cur_lenght>max_index){
                    max_index=cur_lenght;

                }
                cur_lenght=i-prev_index;
            }
            visited[a.charAt(i)]=i;
        }
        if(cur_lenght > max_index)
            max_index = cur_lenght;

        return max_index;
    }
    public static void main(String[] args)
    {

        int x[][]=new int[5][8];
        System.out.println(x.length+" "+x[1].length);
        String str = "ABDEFGABEF";
        System.out.println("The input string is "+str);
        int len = computeLongestString(str);
        System.out.println("The length of "
                + "the longest non repeating character is "+len);
    }
    }
