package com.javacommon;


import org.junit.Test;

public class SerializableModelTest {


    @Test
    public void test() {
        SerializableModel model = new SerializableModel();
        model.setAge(22);
        model.setName("22");

        SerializebleUtils.writeObj(model, ClassLoader.getSystemResource("").getPath() + "employee.ser");

    }

    @Test
    public void test2() {

        SerializableModel model = SerializebleUtils.readObj(SerializableModel.class, ClassLoader.getSystemResource("").getPath() + "employee.ser");

        System.out.println(model);


    }
}
