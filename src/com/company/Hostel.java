package com.company;

public class Hostel extends Family implements Livable {

    public Hostel(int familyMember, String address) {
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
        System.out.println("Family lives in hostel");

    }

    @Override
    public void payUtilities() {

    }

    @Override
    public void payRent() {
        System.out.println("Family pays rent");

    }

    @Override
    public String toString() {
        return "Hostel{}";
    }
}
