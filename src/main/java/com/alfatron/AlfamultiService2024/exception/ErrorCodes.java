package com.alfatron.AlfamultiService2024.exception;


public enum ErrorCodes {

    ORDRE_DE_MISSION_NOT_FOUND(1000),
    ORDRE_DE_MISSION_NOT_VALID(1001),

    CLIENT_NOT_FOUND(2000),
    CLIENT_NOT_VALID(2001),

    EMPLOYEE_NOT_FOUND(3000),
    EMPLOYEE_NOT_VALID(3001),

    FOURNISSEUR_NOT_FOUND(4000),
    FOURNISSEUR_NOT_VALID(4001),

    NATURE_DE_MISSION_NOT_FOUND(5000),
    NATURE_DE_MISSION_NOT_VALID(5001),

    STRUCTURE_NOT_FOUND(6000),
    STRUCTURE_NOT_VALID(6001),

    TYPE_DE_TRANSPORT_NOT_FOUND(7000),
    TYPE_DE_TRANSPORT_NOT_VALID(7001),

    VEHICULE_NOT_FOUND(8000),
    VEHICULE__NOT_VALID(8001);


    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
