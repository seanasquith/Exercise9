package com.company.asquith;

public class Main {

    public static void main(String[] args) {
        CallContact sean = new CallContact("Sean", "6147568500");
        sean.contact();
        EmailContact eric = new EmailContact("Eric", "eric@gmail.com");
        eric.contact();
    }
}
