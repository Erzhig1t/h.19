package com.company;

public class Apartment extends Family implements Livable {

    public Apartment(int familyMember, String address) {
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
        System.out.println("Family lives in apartment");
    }

    @Override
    public void payUtilities() {
        System.out.println("Family pays utilities");
    }

    @Override
    public void payRent() {

    }

    @Override
    public String toString() {
        return "Apartment{}";
    }
}
