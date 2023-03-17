package Exception;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(){
        super("No se pueden usar números negativos");
    }
}
