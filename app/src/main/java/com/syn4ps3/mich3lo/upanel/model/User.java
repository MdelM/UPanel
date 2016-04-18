package com.syn4ps3.mich3lo.upanel.model;

import java.io.Serializable;

/**
 * Created by Mich3lo on 4/18/16.
 */
public class User implements Serializable {

    public String getTown() {
        return town;
    }

    public void setTown(String eTown) {
        this.town = eTown;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phonen) {
        this.phoneNumber = phonen;
    }



    private String fullName;
    private String town;
    private String phoneNumber;


    public User(){
        //Null constructor
    }

    public User(String fullName,String town, String phoneNumber){

        this.fullName=fullName;
        this.town=town;
        this.phoneNumber=phoneNumber;

    }


}
