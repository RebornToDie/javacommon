package com.javacommon.serializable.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class SerializableBaseModel implements Serializable {

    private static final long serialVersionUID = -2661485153049388831L;

    private String id;

}
