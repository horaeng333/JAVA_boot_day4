package com.oopsw.simple;

public class Manager extends Worker{
    private String position;

    public Manager(){
        super();
    }
    public Manager(String position, String WorkerNumber, String name){
        super(WorkerNumber, name);
        setPosition(position);
    }
    public void setPosition(String position) {
        this.position=position;
    }
    public String getPosition() {
        return position;
    }
}
