package br.com.ksilvaf.payrollapi.services.exeptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message) {
        super(message);
    }

}
