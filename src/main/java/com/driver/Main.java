package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "name";
        // Error : name has private access in com.driver.RWOnly

        System.out.println("Before : " + obj.getName());
        obj.setName("Change Name");
        System.out.println("After : " + obj.getName());
    }
}