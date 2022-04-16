package com.unborn.blogger.exceptions;

import com.unborn.blogger.datatransferobject.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        String message = ex.getMessage();
        Boolean status = false;
        ApiResponse apiResponse = new ApiResponse(message,status);
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
