package com.oopsw.simple;

public class Student {
    //member data 는 private 권장.
    private String studentNumber;
    private String name;
    private char gender;

    //생성자(: 클래스 이름과 같음) 오버로딩(: 이름은 같고 매개인자가 다른 것).
    //생성자가 없으면 VM이 default constructor(디폴트 생성자)를 작성해줌.
    public Student() {} //default constructor.
    public Student (String StudentNumber, String name, char gender) {
        setStudentNumber(studentNumber);
        setName(name);
        setGender(gender);
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber=studentNumber;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setGender(char gender) {
        if(gender=='M' || gender=='F')
            this.gender = gender;
    }
    public char getGender() {
        return gender;
    }

}
