package com.example.dependencyInjectionTut;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private String name;
    private String tech;
    @Autowired
    private laptop laptop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public laptop getlaptop() {
        return laptop;
    }

    public void setlaptop(laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){
        System.out.println("Dependency Injection done");
        laptop.compiler();
    }
}
