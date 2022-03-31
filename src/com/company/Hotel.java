package com.company;

public class Hotel extends Family implements Livable {

    public Hotel(int familyMember, String address) {
        super(familyMember, address);
    }

    @Override
    public int getFamilyMember() {
        return super.getFamilyMember();
    }

    @Override
    public void setFamilyMember(int familyMember) {
        super.setFamilyMember(familyMember);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public void live() {
        System.out.println("family lives in hotel");

    }

    @Override
    public void payUtilities() {

    }

    @Override
    public void payRent() {
        System.out.println("Famiy pay rent");

    }

    @Override
    public String toString() {
        return "Hotel{}";
    }
}
