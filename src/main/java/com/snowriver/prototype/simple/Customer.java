package com.snowriver.prototype.simple;

import java.util.List;

public class Customer implements Prototype{

    private Integer age;
    private Long hign;
    private String name;
    private List habbits;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getHign() {
        return hign;
    }

    public void setHign(Long hign) {
        this.hign = hign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHabbits() {
        return habbits;
    }

    public void setHabbits(List habbits) {
        this.habbits = habbits;
    }

    @Override
    public Prototype clone() {
        Customer customer = new Customer();
        customer.setAge(this.age);
        customer.setHabbits(this.habbits);
        customer.setHign(this.hign);
        customer.setName(this.name);
        return customer;
    }
}