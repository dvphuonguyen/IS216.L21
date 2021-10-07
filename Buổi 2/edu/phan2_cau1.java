/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.lab2_thuchanh;

/**
 *
 * @author phuon
 */
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String show() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
}

class Employee extends Person{
     private float salary;

    public Employee(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public Employee() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
     
    public float addSalary(){
        return (float) (this.salary * 1.1);
    }
    
    public float addSalary(float per){
        return this.salary*(1+per);
    }
    
}
public class phan2_cau1 {
    
}
