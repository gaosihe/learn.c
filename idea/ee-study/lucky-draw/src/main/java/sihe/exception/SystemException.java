package sihe.exception;

public class SystemException  extends BaseException{
    public SystemException(String code, String message) {
        super(code, message);
    }

    public SystemException(String message, Throwable cause, String code) {
        super(message, cause, code);
    }
}
