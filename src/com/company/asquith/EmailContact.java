package com.company.asquith;

public class EmailContact extends Contact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + getEmail());
    }
}
