package org.example;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;


@Service("basicPolicy")
public class BasicPolicy implements Policy {

    @NotBlank(message = "Policy name should not be blank")
    private String policyName;

    public BasicPolicy() {
        this.policyName = "Basic Policy";
    }

    @Override
    public void applyPolicy() {
        System.out.println("Applying "+policyName);
    }

}
