/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private float gpa;

    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, float gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        // Return a default value or throw an UnsupportedOperationException
        return "Address not provided";
    }

    @Override
    public void setAddress(String address) {
        // Implement this method if needed
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                '}';
    }
}
