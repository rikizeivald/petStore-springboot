package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "age")
    private int age;

    @Column(name = "price")
    private int price;

    @Column(name = "species")
    private String species;

    @Column(name = "status")
    private String status;

    public Pet() {

    }

    public Pet(int age, int price, String species,String status) {
        this.age = age;
        this.price = price;
        this.species = species;
        this.status=status;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", age=" + age + ", price=" + price + ", species=" + species +", status=" + status + "]";
    }

}
