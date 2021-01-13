package ru.fed3375546.exceptions;

public class UserServiceException extends RuntimeException{

    private static final long serialVersionUID = -8064673038685703632L;

    public UserServiceException(String message) {
        super(message);
    }
}
