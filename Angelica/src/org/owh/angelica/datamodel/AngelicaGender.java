package org.owh.angelica.datamodel;

public enum AngelicaGender {
	UNKNOWN("Unknown", 0),
    MALE("Male", 1),
    FEMALE("Female", 2);
    private String stringValue;
    private int intValue;
    
    private AngelicaGender(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }

}
