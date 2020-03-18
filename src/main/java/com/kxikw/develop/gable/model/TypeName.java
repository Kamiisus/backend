package com.kxikw.develop.gable.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TypeName")
public class TypeName {

    String type_id;
    String type_name;

    public TypeName() {
    }

    public TypeName(String type_name) {
        this.type_name = type_name;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }
}