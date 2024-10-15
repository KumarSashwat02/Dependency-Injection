package com.example.dependencyInjectionTut;

import org.springframework.stereotype.Component;

@Component
public class laptop {
    private int Lid;
    private String brand;

    public int getLId() {
        return Lid;
    }

    public void setLId(int Lid) {
        this.Lid = Lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "Lid=" + Lid +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compiler(){
        System.out.println("Compiling");
    }


}
