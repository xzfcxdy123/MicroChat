package com.web.microchat.common.exception;

public class NotFoundException extends Exception {

    public NotFoundException() {
        super("Not found such file or directory.");
    }
}
