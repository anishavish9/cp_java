package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

}
