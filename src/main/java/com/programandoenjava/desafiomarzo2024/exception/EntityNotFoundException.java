package com.programandoenjava.desafiomarzo2024.exception;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ControllerAdvice;



public class EntityNotFoundException extends RuntimeException{


    public EntityNotFoundException(String message){
        super(message);
    }



}
