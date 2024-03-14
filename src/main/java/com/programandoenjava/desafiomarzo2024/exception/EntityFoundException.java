package com.programandoenjava.desafiomarzo2024.exception;

import org.apache.tomcat.util.http.parser.EntityTag;


/**
 * Class correspondiente a Entity Found Exception
 */
public class EntityFoundException extends EntityNotFoundException {

    public EntityFoundException(String message) {
        super(message);
    }
}
