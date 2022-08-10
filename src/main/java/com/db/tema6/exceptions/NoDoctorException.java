package com.db.tema6.exceptions;

public class NoDoctorException extends Exception {
    public NoDoctorException() {
        super("This doctor does not exist!");
    }
}
