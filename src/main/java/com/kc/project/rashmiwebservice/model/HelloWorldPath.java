package com.kc.project.rashmiwebservice.model;

public class HelloWorldPath {
    private String name;

    public HelloWorldPath(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldPath{" +
                "name='" + name + '\'' +
                '}';
    }
}
