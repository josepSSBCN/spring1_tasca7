package ClassPackage;

import Annotations.MethodAnnotation;
import Annotations.PrintAnnotation;

import java.io.Serializable;


@PrintAnnotation(path = "c:\\temp", name = "Rigoberto")
public class Person implements Serializable {
    //region ATTRIBUTES
    private String name;
    private String surname;
    private int age;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //endregion GETTERS & SETTERS


    //region METHODS

    @MethodAnnotation(execute = true)
    public static String method1() {
        return "Method 1 is executed!";
    }

    @MethodAnnotation(execute = false)
    public static String method2() {
        return "Method 2 is executed!";
    }

    @MethodAnnotation(execute = true)
    public static String method3() {
        return "Method 3 is executed!";
    }

    @MethodAnnotation(execute = false)
    public static String method4() {
        return "Method 4 is executed!";
    }
    //endregion METHODS


}



