package com.deepak.unit3;

public class MethodRef {

public static void main(String[] args){
Thread t=new Thread(()->printMessage());
t.start();

}
public static void printMessage(){
    System.out.println("adfdssddsf");
}

}
