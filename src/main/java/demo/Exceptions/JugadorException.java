package demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by eduard.martinez on 04/11/2015.
 */



@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class JugadorException  extends RuntimeException{
    public JugadorException(String error){
        super(error);
    }
}
