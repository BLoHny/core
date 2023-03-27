package hello.core.singleton;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import
        org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
public class StatefulServiceTest {
    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new
                AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean("statefulService",
                StatefulService.class);
        StatefulService statefulService2 = ac.getBean("statefulService",
                StatefulService.class);
    }
    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}