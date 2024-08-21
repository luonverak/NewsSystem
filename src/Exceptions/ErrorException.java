
package Exceptions;

public class ErrorException {
    
    public String errorMessage(Throwable throwable){
        return throwable.getMessage();
    }
    
}
