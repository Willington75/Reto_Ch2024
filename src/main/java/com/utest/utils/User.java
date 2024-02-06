package com.utest.utils;

public enum User {

    FIRSTNAME("Daniel"),
    LASTNAME("Valderrama"),
    EMAIL("DanyV2024@test.com"),
    COD_POSTAL("11001"),
    USER_PASSWORD("Colombia2024*"),
    CONFIRM_PASSWORD("Colombia2024*");


    private String value;

    User(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
