package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolicyService policyService = context.getBean(PolicyService.class);
        policyService.apply();  // This will use the BasicPolicy implementation

    }

}
