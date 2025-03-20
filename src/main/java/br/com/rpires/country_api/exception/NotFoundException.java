package br.com.rpires.country_api.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class NotFoundException extends RuntimeException {

    private HttpStatus status;

    public NotFoundException(String message) {
        super(message);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public NotFoundException(String message, Exception e) {
        super(message, e);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public NotFoundException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
