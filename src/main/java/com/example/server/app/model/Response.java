package com.example.server.app.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
}
