package com.cgg.createpattern.prototype;

/**
 * @author cgg cgg244@qq.com
 * @data 18-10-29 下午6:09
 * gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Person implements Cloneable {
    private String name;
    private int age;
    private String[] hobby;

    public Person(String name, int age, String[] hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.setHobby(this.hobby.clone());
        return person;
    }
}
