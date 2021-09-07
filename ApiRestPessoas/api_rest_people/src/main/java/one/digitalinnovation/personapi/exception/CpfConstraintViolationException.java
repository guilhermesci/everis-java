package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLIntegrityConstraintViolationException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CpfConstraintViolationException extends SQLIntegrityConstraintViolationException {

    public CpfConstraintViolationException() {
        super("CPF already exists!");
    }
}
