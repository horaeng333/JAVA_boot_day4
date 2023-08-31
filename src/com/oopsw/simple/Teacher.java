package com.oopsw.simple;

public class Teacher extends Person{
    private String teacherNumber;
//    private String tname;
//    private char tgender;
//    public Teacher() {}
    public Teacher(String TeacherNumber, String name, char gender) { //멤버데이터:3개.
        super(name, gender);
        this.teacherNumber=teacherNumber;
//        setTeacherNumber(teacherNumber);
//        setTName(tname);
//        setTGender(tgender);
    }
//    public void setTeacherNumber(String teacherNumber) {
//        this.teacherNumber=teacherNumber;
//    }
    public String getTeacherNumber() {
        return teacherNumber;
    }
//    public void setName(String name) {
//        this.name=name;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setGender(char gender) {
//        this.gender=gender;
//    }
//    public char getGender() {
//        return gender;
//    }
}
