package com.javacommon.serializable.serializable;

import lombok.Data;

@Data
public class SerializableModel extends SerializableBaseModel {

    private static final long serialVersionUID = 6772078109454759886L;

    private String name;
    private int age;
    private int sex;

}
