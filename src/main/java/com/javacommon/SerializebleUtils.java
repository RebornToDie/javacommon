package com.javacommon;

import java.io.*;

public class SerializebleUtils {

    public static <T extends Serializable> T writeObj(T model, String outPutPath) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(outPutPath);//"/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(model);
            out.close();
            fileOut.close();
//            System.out.printf("Serialized data is saved in /tmp/Employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        return model;
    }


    public static <T extends Serializable> T readObj(Class<T> modelClass, String outPutPath) {



        try {
            T model = modelClass.newInstance();
            FileInputStream fileIn = new FileInputStream(outPutPath);//"/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            model = (T) in.readObject();
            in.close();
            fileIn.close();
            return model;
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;

    }


}
