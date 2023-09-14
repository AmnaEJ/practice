package com.example.practice.DTOS;

public class ResourceNotFoundExceptiom extends RuntimeException{
    public ResourceNotFoundExceptiom(String message){
        super(message);
    }
}
