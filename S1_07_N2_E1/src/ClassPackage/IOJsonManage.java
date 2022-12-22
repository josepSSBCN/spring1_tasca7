package ClassPackage;

import org.json.simple.JSONObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOJsonManage {
    //region ATTRIBUTES
    static JSONObject myJsonObject;
    static FileOutputStream fos;
    static ObjectOutputStream outObject;


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    //endregion GETTERS & SETTERS


    //region METHODS
    public static boolean writJsonSerializable(String path, String fileName, String key, Object value) throws IOException {
        //region DEFINITION VARIABLES
        boolean resul = false;
        String completPath;
        myJsonObject = new JSONObject();

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        try {
            // 0) Initilizations
            outObject = null;
            completPath = String.format(path + "\\" + fileName + ".json");

            // 1) Chekings
            if (!key.isEmpty() & !path.isEmpty() & !fileName.isEmpty()) {
                // 2) More chekings
                if (Files.exists(Paths.get(path)) && Files.isDirectory(Paths.get(path))) {
                    // 3) Put info to json & write json file
                    myJsonObject.put(key, value);
                    fos = new FileOutputStream(completPath);
                    outObject = new ObjectOutputStream(fos);
                    outObject.writeObject(myJsonObject);

                } else {
                    //TODO Falta crear l'excepció i llançar-la
                    resul = false;
                }
            } else {
                //TODO Falta crear l'excepció i llançar-la
                resul = false;
            }
        } finally {
            if (outObject != null) {
                outObject.close();
            }
        }

        //endregion ACTIONS


        // OUT
        return resul;


    }

    //endregion METHODS


}
