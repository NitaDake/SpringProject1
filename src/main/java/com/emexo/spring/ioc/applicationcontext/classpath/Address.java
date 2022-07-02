package com.emexo.spring.ioc.applicationcontext.classpath;

public class Address {
    private String street="S.B Road";
    private String city="Pune";
    private String state="MH";

    public void getAddress(){
        System.out.println("Street Name:"+street);
        System.out.println("City Name:"+city);
        System.out.println("State Name:"+state);

    }

}
