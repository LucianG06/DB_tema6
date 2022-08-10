package com.db.tema6.exceptions;

public class NoSpecialtyException extends Exception {
    public NoSpecialtyException() {
        super("This specialty does not exist!");
    }
}
