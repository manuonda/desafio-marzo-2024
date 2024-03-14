package com.programandoenjava.desafiomarzo2024.entity.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseExceptionDTO {

    private String message;
    private Integer status;

    public ResponseExceptionDTO(String message, Integer status){
        this.message = message;
        this.status = status;
    }


}
