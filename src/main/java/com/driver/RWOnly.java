package com.driver;

public class RWOnly {
    private String name;

    public RWOnly() {
        name = "Default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
