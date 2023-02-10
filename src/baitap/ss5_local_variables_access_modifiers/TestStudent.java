package baitap.ss5_local_variables_access_modifiers;

import baitap.ss5_local_variables_access_modifiers.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Nam");
        student.setClasses("A10");
        System.out.println(student);
    }
}
