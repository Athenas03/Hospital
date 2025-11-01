package com.advanced.java.homework.four.objects;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String cityAddress;
    private String stateAddress;
    private String zipCode;

    public Person() {

    }


    public Person(String firstName, String lastName, String streetAddress,
                  String cityAddress, String stateAddress, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.stateAddress = stateAddress;
        this.zipCode = zipCode;


    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastNameName(){
        return lastName;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public String getCityAddress() {
        return cityAddress;
    }
    public String getStateAddress() {
        return stateAddress;
    }
    public String getZipCode() {
        return zipCode;
    }
}
