package com.syntexpro.qa;

public class MyDog {
    private String name;
    private int age;
    private String color;
    private int hight;
    private int wight;

    public MyDog(String name, int age, String color, int hight, int wight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hight = hight;
        this.wight = wight;
    }

    public MyDog(String name) {

    }

    public void meow() {
        System.out.println(name + ":don..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }


    @Override
    public String toString() {
        return "MyDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", hight=" + hight +
                ", wight=" + wight +
                '}';
    }
}


