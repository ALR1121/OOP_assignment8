/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;

    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + getGpa() +
                ", credits=" + credits +
                '}';
    }
}