package com.company.asquith;

public abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();
}
