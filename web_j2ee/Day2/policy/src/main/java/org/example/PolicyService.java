package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PolicyService {

    private Policy policy;

    @Autowired
    public PolicyService(@Qualifier("basicPolicy") Policy policy) {
        this.policy = policy;
    }


    public void apply() {
        policy.applyPolicy();
    }
}




