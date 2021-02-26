package com.kc.project.rashmiwebservice.model;

public class HelloWorldBean {

    private String message;
    private int id;
    private String name;
    private boolean flag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }
    public HelloWorldBean(String message,int id,String name, boolean flag) {
        this.message = message;
        this.id =id;
        this.name=name;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]",message);
    }
}
