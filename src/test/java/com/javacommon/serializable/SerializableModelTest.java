package com.javacommon.serializable;


import com.javacommon.serializable.serializable.SerializableModel;
import com.javacommon.serializable.serializable.SerializebleUtils;
import org.junit.Test;

public class SerializableModelTest {


    @Test
    public void testWrite() {
        SerializableModel model = new SerializableModel();
        model.setId("id22");
        model.setAge(22);
        model.setName("22");

        SerializebleUtils.writeObj(model, ClassLoader.getSystemResource("").getPath() + "employee.ser");

    }

    @Test
    public void testRead() {

        SerializableModel model = SerializebleUtils.readObj(SerializableModel.class, ClassLoader.getSystemResource("").getPath() + "employee.ser");

        System.out.println(model);


    }
}
