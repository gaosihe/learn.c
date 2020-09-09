package sihe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("sihe.mapper")//扫描sihe.mapper包下,所有带@Mapper注解的接口,通过Mybatis框架,使用AOP技术,生成代理类
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
