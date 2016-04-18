package com.syn4ps3.mich3lo.upanel.model;

import java.io.Serializable;

/**
 * Created by Mich3lo on 4/18/16.
 */
public class Course implements Serializable {

    private String name;
    private String text;

    public Course(){
        //Necessary for firebase's deserializer
    }

    public Course(String name, String text){
        this.name=name;
        this.text=text;
    }

    public String getName(){
        return name;
    }

    public String getText(){
        return text;
    }

}
