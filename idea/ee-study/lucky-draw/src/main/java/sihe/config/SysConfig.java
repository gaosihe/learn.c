package sihe.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import sihe.config.interceptor.LoginInterceptor;
import sihe.config.web.RequestResponseBodyMethodProcessorWrapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SysConfig implements WebMvcConfigurer, InitializingBean{

    @Resource
    private RequestMappingHandlerAdapter adapter;
    //SpringMVC初始化操作时就会注册的对象
    @Autowired
    private ObjectMapper objectMapper;

    //和之前以@ControllerAdvice+实现ResponseBodyAdvice接口,完成统一处理返回数据包装:无法解决返回null包装为自定义类型
    //改用现在这种方式,可以解决返回null包装为自定义类型
    @Override
    public void afterPropertiesSet() {
        List<HandlerMethodReturnValueHandler> returnValueHandlers = adapter.getReturnValueHandlers();
        List<HandlerMethodReturnValueHandler> handlers = new ArrayList(returnValueHandlers);
        for(int i=0; i<handlers.size(); i++){
            HandlerMethodReturnValueHandler handler = handlers.get(i);
            if(handler instanceof RequestResponseBodyMethodProcessor){
                handlers.set(i, new RequestResponseBodyMethodProcessorWrapper(handler));
            }
        }
        adapter.setReturnValueHandlers(handlers);

    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor(objectMapper))
                .addPathPatterns("/api/**")//**代表多级任意匹配
                .excludePathPatterns("/api/user/login")
                .excludePathPatterns("/api/user/register")
                .excludePathPatterns("/api/user/logout");
    //再添加一个前端静态资源请求的拦截器,非登录页面(/*.html排除/index.html),如果没有登陆,重定向到/index.html
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //Controller 路径,统一添加请求的路径前缀,第二个参数,表示是否添加
        //表示所有Controller路径加/api前缀
        configurer.addPathPrefix("api",c->true);

    }


}


