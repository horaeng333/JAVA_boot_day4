package com.oopsw.simple;

public class Teacher {
    private String teacherNumber;
    private String tname;
    private char tgender;
    public Teacher() {}
    public Teacher(String TeacherNumber, String tname, char tgender) {
        setTeacherNumber(teacherNumber);
        setTName(tname);
        setTGender(tgender);
    }
    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber=teacherNumber;
    }
    public String getTeacherNumber() {
        return teacherNumber;
    }
    public void setTName(String tname) {
        this.tname=tname;
    }
    public String getTName() {
        return tname;
    }
    public void setTGender(char tgender) {
        this.tgender=tgender;
    }
    public char getTGender() {
        return tgender;
    }
}
