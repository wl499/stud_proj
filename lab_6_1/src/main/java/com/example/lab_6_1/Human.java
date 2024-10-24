package com.example.lab_6_1;

import android.content.Intent;
import java.io.Serializable;

public abstract class Human implements Serializable {
    protected String firstName;
    protected String secondName;
    protected Integer age;

    Human(){

    }

    Human(String firstName){
        this.firstName = firstName;
    }

    Human(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    Human(String firstName, String secondName, Integer age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public Integer getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String toString(){
        return String.format("Human = {firstName: %s, lastName: %s, age: %d}",
                this.firstName, this.secondName, this.age);
    }
}
