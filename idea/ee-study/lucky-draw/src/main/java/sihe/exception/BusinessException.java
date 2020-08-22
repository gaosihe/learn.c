package sihe.exception;

public class BusinessException  extends BaseException {
    public BusinessException(String code, String message) {
        super("BUS"+code, message);
    }

    public BusinessException(String message, Throwable cause, String code) {
        super("BUS"+message, cause, code);
    }
}
