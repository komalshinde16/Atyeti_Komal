package ThisKeyword;

public class Student {
    String name;
    int id;
    String bloodgrp;
    int age;

    Student(String name){
        this.name = name;
        this.id = 1;
        this.bloodgrp = "S";
        this.age = 88;
    }

    static void main() {
        Student s1 = new Student("Komal");

        System.out.println(s1.name);
        System.out.println(s1.bloodgrp);
        System.out.println(s1.id);
        System.out.println(s1.age);
    }
}
