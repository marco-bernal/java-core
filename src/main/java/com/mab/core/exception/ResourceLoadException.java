package com.mab.core.exception;

public class ResourceLoadException extends RuntimeException {

    public ResourceLoadException(String message, Throwable reason) {
        super(message, reason);
    }
}
