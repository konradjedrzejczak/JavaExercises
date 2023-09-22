package org.example;

public enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size (String abbrevation ){this.abbrevation = abbrevation; }
    public String getabbrevation() { return abbrevation;}

    private final String abbrevation;
}
