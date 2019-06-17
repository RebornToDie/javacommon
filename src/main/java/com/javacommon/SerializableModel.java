package com.javacommon;

import lombok.Data;

import java.io.Serializable;

@Data
public class SerializableModel implements Serializable {

    private String name;
    private int age;
    private int sex;

}
