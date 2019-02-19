package assignment.interfaces.impl;

import assignment.interfaces.IFish;

public class Fish implements IFish {

    private String size;
    private String color;
    private String detail;

    public Fish() {

    }

    public Fish(final String size, final String color, final String detail) {
        this.size = size;
        this.color = color;
        this.detail = detail;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(final String detail) {
        this.detail = detail;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
