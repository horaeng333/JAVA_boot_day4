package com.oopsw.simple;
//학번,이름,성별,교사번호,이름,성별
//공통 멤버(이름, 성별) 구현
public class Person {
    //1. private member data
    private String name;
    public char gender;

    //3. constructor
    public Person(){}
    public Person(String name, char gender) {
        setName(name);
        setGender(gender);
    }

    //2. set method, get method
    public void setName(String name) {
        this.name=name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
}
