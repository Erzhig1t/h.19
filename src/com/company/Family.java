package com.company;

public abstract class Family {

    private int familyMember;

    private String address;


    public Family(int familyMember, String address) {
        this.familyMember = familyMember;
        this.address = address;
    }

    public int getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(int familyMember) {
        this.familyMember = familyMember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
