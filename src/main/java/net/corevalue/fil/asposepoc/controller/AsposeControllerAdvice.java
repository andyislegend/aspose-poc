package net.corevalue.fil.asposepoc.controller;

import net.corevalue.fil.asposepoc.exceptions.AttachmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AsposeControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(AttachmentNotFoundException.class)
    public ExceptionResponse attachmentNotFoundHandler() {
        return new ExceptionResponse("No Attachment found with provided Id");
    }
}
