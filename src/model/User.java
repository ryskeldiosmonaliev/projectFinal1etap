package model;

public class User {
    private int id;
    private String name;
    private int age;
    Gender gender;

    public User(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User() {
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
public static class Builder{
        private User newUser;

    public Builder() {
        newUser=new User();
    }
    public Builder withId(int id){
        newUser.id=id;
        return this;
    }
    public Builder withName(String name){
        newUser.name=name;
        return this;
    }
    public Builder withAge(int age){
        newUser.age=age;
        return this;
    }
    public Builder withGender(Gender gender){
        newUser.gender=gender;
        return this;
    }
    public User builds(){
        return newUser;
    }
}
}
