package lessons;

import lessons.services.BeanWithDependency;
import lessons.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfiguration {

    @Autowired
    private GreetingService greetingService;

    @Bean
    public BeanWithDependency beanWithDependency() {
        return new BeanWithDependency();
    }
}
