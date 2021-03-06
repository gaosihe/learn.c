package frank;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "frank.mapper")
public class SpringbootStudy {

    public static void main(String[] args) {
        SpringApplication.run(frank.SpringbootStudy.class, args);
    }
}