package com.company.asquith;

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();
}

class EmailContact extends Contact {
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

class CallContact extends Contact {
    private String phoneNum;

    public CallContact(String name, String phoneNum) {
        super(name);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + getPhoneNum());
    }
}


public class Main {

    public static void main(String[] args) {
        CallContact cc1 = new CallContact("Sean", "6147568500");
        cc1.contact();
        EmailContact ec1 = new EmailContact("Eric", "eric@gmail.com");
        ec1.contact();
    }
}
