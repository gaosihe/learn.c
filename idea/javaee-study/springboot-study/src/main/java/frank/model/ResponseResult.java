package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseResult {
    private boolean success;

    private Object data;//success = true需要的业务数据

    private String code;//success = false;

    private String message;
}
