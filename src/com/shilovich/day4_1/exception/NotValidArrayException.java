package com.shilovich.day4_1.exception;

public class NotValidArrayException extends Exception {
    public NotValidArrayException() {
        super();
    }

    public NotValidArrayException(String message) {
        super(message);
    }

    public NotValidArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidArrayException(Throwable cause) {
        super(cause);
    }
}
