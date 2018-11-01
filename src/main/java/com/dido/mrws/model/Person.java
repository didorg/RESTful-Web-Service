package com.dido.mrws.model;

public class Person {
  private Long id;
  private String name;
  private String lastName;
  private Integer age;
  private String address;
  private String example;

  public Person(Long id, String name, String lastName, Integer age, String address, String example) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
    this.example = example;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }
}
