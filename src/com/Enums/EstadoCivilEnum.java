package com.Enums;

//Aproximacion al patron Singleton
public enum EstadoCivilEnum {

    // SOLTERO | CASADO | DIVORCIADO | VIUDO

    CASADO("Casado"),
    SOLTERO("Soltero"),
    DIVORCIADO("Divorciado"),
    VIUDO("Viudo");

    private final String str;

    private EstadoCivilEnum(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
