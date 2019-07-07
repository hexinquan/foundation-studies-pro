package com.learn.java8.entity;

/**
 * Created by hexinquan on 2018/10/26.
 */
public class SchemaField {
    private Long id;
    private String name;
    private Long schemaId;
    private String cnName;
    private String type;
    private String required;

    public SchemaField(Long id, String name, Long schemaId, String cnName, String type, String required) {
        this.id = id;
        this.name = name;
        this.schemaId = schemaId;
        this.cnName = cnName;
        this.type = type;
        this.required = required;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }
}
