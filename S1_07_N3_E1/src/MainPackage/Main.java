package MainPackage;

import Annotations.MethodAnnotation;
import Annotations.PrintAnnotation;
import ClassPackage.IOJsonManage;
import ClassPackage.Person;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        String text = "";
        ArrayList<Person> myPersons;
        ArrayList<Method> myMethods;
        PrintAnnotation myPrintAnnotation;
        MethodAnnotation myMethodAnnotation;
        Person myPerson = new Person("Rob", "Janoff", 84);
        Person myPerson2 = new Person("Christopher", "Latham Sholes", 71);
        Person myPerson3 = new Person("William", "Addis", 74);

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        // EXERCISE S1_07_N2_E1
        // 1) Get annotation
        try {
            if (myPerson.getClass().isAnnotationPresent(PrintAnnotation.class)) {
                myPrintAnnotation = myPerson.getClass().getAnnotation(PrintAnnotation.class);

                // 2) Create json file with the annotation path
                IOJsonManage.writJsonSerializable(myPrintAnnotation.path(), myPrintAnnotation.name(), myPerson.getName(), myPerson);
            } else {
                System.out.println("No hi ha objectes amb anotacions.");
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        // EXERCISE S1_07_N3_E1
        try {
            // 1) Add persons to list
            myPersons = new ArrayList<>(Arrays.asList(myPerson, myPerson2, myPerson3));

            // 2) Iterate for all persons
            for (Person p : myPersons) {
                // 3) Get & iterate for all methods of Person class
                myMethods = new ArrayList<>(Arrays.asList(p.getClass().getMethods()));
                for (Method m : myMethods) {
                    if (m.isAnnotationPresent(MethodAnnotation.class)) {
                        // 4) Arrive inside, only the methods with annotation 'MethodAnnotation'
                        myMethodAnnotation = m.getAnnotation(MethodAnnotation.class);
                        if (myMethodAnnotation.execute()) {
                            // 5) Arrive here, only if the annotation param 'execute' is true
                            // Invoke the methode, to get it value.
                            text = String.format("%sPERSON NAME: %-20s METHOD NAME: %-10s METHODE INVOKE VALUE: %s\r\n",
                                    text, p.getName(), m.getName(), m.invoke(p));
                        }
                    }
                }
            }
            System.out.println(text);

        } catch (Exception ex) {
            boolean exit = false;
            int index = 0;

            System.out.println(ex.getCause().toString());

            String text2 = String.format("\r\nERROR: %s\r\nLOCATION:\r\n", ex.getMessage());
            List<StackTraceElement> temp2 = new ArrayList<>(Arrays.asList(ex.getStackTrace()));
            if (temp2.size() > 0) {
                do {
                    if (temp2.get(index).getClassLoaderName() == "app") {
                        text2 = String.format("%sPACKAGE: %s FILE: %s    METHOD: %s  LINE: %S\r\n", text2,
                                temp2.get(index).getClassName(), temp2.get(index).getFileName(),
                                temp2.get(index).getMethodName(), temp2.get(index).getLineNumber());
                        exit = true;
                    }
                    index++;
                } while (!exit);
            } else {
                text2 = ex.getCause().toString();
            }
            System.err.println(text2);

        }

        //endregion ACTIONS


        // OUT
        System.out.println("*** FINAL DEL PROGRAMA ***");

    }
}