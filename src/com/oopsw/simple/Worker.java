package com.oopsw.simple;

public class Worker {
    //1.공통 멤버
    private String workerNumber;
    private String name;
    //3.생성자
    public Worker(){}
    public Worker(String WorkerNumber, String name) {
        setWorkerNumber(WorkerNumber);
        setName(name);
    }
    //2. set get 메서드
    public void setWorkerNumber(String workerNumber) {
        this.workerNumber = workerNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWorkerNumber() {
        return workerNumber;
    }
    public String getName() {
        return name;
    }
}
