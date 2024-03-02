/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bravo
 */
public class Rectangle {
    private double side;
    private double length;

    public Rectangle(double side, double length) {
        this.side = side;
        this.length = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

   
    public double getArea() {
        return side * length;
    }

    
    public double getPerimeter() {
        return 2*(side + length);
    }

   
    public void printResult() {
        System.out.println("Side: " + side);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
