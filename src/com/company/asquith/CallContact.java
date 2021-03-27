package com.company.asquith;

public class CallContact extends Contact {
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
