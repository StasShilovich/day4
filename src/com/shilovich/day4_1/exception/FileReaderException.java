package com.shilovich.day4_1.exception;

public class FileReaderException extends Exception {
    // FIXME: 26.06.2020 not use this exception
    public FileReaderException() {
        super();
    }

    public FileReaderException(String message) {
        super(message);
    }

    public FileReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileReaderException(Throwable cause) {
        super(cause);
    }
}
