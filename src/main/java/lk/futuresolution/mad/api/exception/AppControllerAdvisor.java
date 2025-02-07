package lk.futuresolution.mad.api.exception;

import lk.futuresolution.mad.api.controller.Response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControllerAdvisor {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handleNFException(Exception exception) {

        ErrorResponse errorResponse = new ErrorResponse();

        errorResponse.setMessage(exception.getMessage());

        return errorResponse;
    }
}

