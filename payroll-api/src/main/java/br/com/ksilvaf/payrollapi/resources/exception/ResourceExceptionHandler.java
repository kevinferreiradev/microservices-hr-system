package br.com.ksilvaf.payrollapi.resources.exception;

import br.com.ksilvaf.payrollapi.services.exeptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
               new StandardError(
                       LocalDateTime.now(),
                       ex.getMessage(),
                       HttpStatus.NOT_FOUND.value(),
                       request.getRequestURI())
        );
    }
}
