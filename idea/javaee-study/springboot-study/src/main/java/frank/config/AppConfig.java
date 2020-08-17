package frank.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import frank.config.interceptor.Loginlnterceptor;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Autowired
    private ObjectMapper objectMapper;
    /**
     * 添加web配置:添加拦截器(根据路径进行拦截
     * /*代表一级的路径,如/user /*,可以匹配到user/abc,不能匹配到user/abc/1
     * /**代表多级的路径
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //实现用户会话管理的功能
        registry.addInterceptor(new Loginlnterceptor(objectMapper))//链式方法设计:当前类型的方法,返回值的this
                .addPathPatterns("/user/**")//添加要拦截的路径
                .excludePathPatterns("/user/login");//排除的路径
    }

    @Bean
    public Map<Integer,Integer> test1(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        return map;
    }
    @Bean
    public Map<Integer,Integer> test2(){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,300);
        map.put(2,400);
        return map;
    }
    @Bean
    public User user1(){
        User u = new User();
        u.setUsername("北边");
        u.setPassword(123);
        return u;
    }
    @Bean
    public User user2(){
        User u = new User();
        u.setUsername("南边");
        u.setPassword(456);
        return u;
    }
}
