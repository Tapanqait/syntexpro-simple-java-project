package com.syntexpro.qa;

public class HelloStudent {

    //five private variables
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String cell;

    //consttructor
    public HelloStudent(String firstName, String lastName, String dob, String address, String cell) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.cell = cell;
    }

    //getter setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    //toString
    @Override
    public String toString() {
        return "HelloStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", cell='" + cell + '\'' +
                '}';
    }


}
