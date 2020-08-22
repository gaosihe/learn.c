package sihe.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 自定义异常的父类
 */
@Getter
@Setter
@ToString
public class BaseException extends RuntimeException{

    private String code;

    public BaseException(String code ,String message) {
        super(message);
        this.code = code;
    }

    public BaseException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}
