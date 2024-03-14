package com.programandoenjava.desafiomarzo2024.exception;


import com.programandoenjava.desafiomarzo2024.entity.dto.ResponseExceptionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * Controller Advice para las exceptions de manera global
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    private static Logger logger= LoggerFactory.getLogger(CustomExceptionHandler.class);


    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ResponseExceptionDTO> handlerNotFound(EntityNotFoundException ex){
        logger.info("handleNot Found " + ex.getMessage());
        ResponseExceptionDTO response = new ResponseExceptionDTO(ex.getMessage(), HttpStatus.NOT_FOUND.value());
        return ResponseEntity.ok(response);
    }



}
