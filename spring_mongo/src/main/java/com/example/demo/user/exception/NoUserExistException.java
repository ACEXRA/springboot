package com.example.demo.user.exception;

public class NoUserExistException extends RuntimeException{
    private String message;
    public NoUserExistException(){}
    public NoUserExistException(String msg){
        super(msg);
        this.message=msg;
    }
}
