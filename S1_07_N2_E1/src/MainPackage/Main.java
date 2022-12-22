package MainPackage;

import Annotations.PrintAnnotation;
import ClassPackage.IOJsonManage;
import ClassPackage.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        PrintAnnotation myPrintAnnotation;
        Person myPerson = new Person("Rob", "Janoff", 84);

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        // 1) Get annotation
        try {
            if (myPerson.getClass().isAnnotationPresent(PrintAnnotation.class)) {
                myPrintAnnotation = myPerson.getClass().getAnnotation(PrintAnnotation.class);

                // 2) Create json file with the annotation path
                IOJsonManage.writJsonSerializable(myPrintAnnotation.path(), myPrintAnnotation.name(), myPerson.getName(), myPerson);
            }else{
                System.out.println("No hi ha objectes amb anotacions.");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        //endregion ACTIONS


        // OUT
        System.out.println("*** FINAL DEL PROGRAMA ***");


    }
}