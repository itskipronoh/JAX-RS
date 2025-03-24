package com.example.demo.model;


public class demo
{
    private String demoId;
    private String demoName;
    private String demoAddress;
    private String demoNumber;

    public demo(

    ) {
    }

    public demo(String demoName, String demoAddress, String demoNumber, String demoId) {
        this.demoName = demoName;
        this.demoAddress = demoAddress;
        this.demoNumber = demoNumber;
        this.demoId = demoId;
    }

    public String getDemoId() {
        return demoId;
    }

    public void setDemoId(String demoId) {
        this.demoId = demoId;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoAddress() {
        return demoAddress;
    }

    public void setDemoAddress(String demoAddress) {
        this.demoAddress = demoAddress;
    }

    public String getDemoNumber() {
        return demoNumber;
    }

    public void setDemoNumber(String demoNumber) {
        this.demoNumber = demoNumber;
    }


}
