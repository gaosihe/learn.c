package sihe.exception;

public class ClientExcption extends BaseException{
    public ClientExcption(String code, String message) {
        super("CLI"+code, message);
    }

    public ClientExcption(String message, Throwable cause, String code) {
        super("CLI"+message, cause, code);
    }
}
