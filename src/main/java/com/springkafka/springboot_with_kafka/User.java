package com.springkafka.springboot_with_kafka;

public class User {


    private String name;
    private String age;
    private String tech;

    public User(String name, String age, String tech) {
        this.name = name;
        this.age = age;
        this.tech = tech;
    }

    public User() {

    }
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getTech() {
        return tech;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }


}
