package com.example.blog.exceptions;

import org.springframework.mail.MailException;

public class BlogException extends RuntimeException {

    public BlogException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public BlogException(String exMessage) {
        super(exMessage);
    }
}
