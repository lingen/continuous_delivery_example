package org.myddd.java.backend.domain.core;

public enum DocumentType {

    DIR ,

    FILE;

    public static DocumentType fromString(String value){
        if("DIR".equalsIgnoreCase(value)){
            return DIR;
        }
        return FILE;
    }

}