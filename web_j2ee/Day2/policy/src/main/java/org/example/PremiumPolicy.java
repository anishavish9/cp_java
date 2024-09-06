package org.example;

import org.springframework.stereotype.Service;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Service("premiumPolicy")
public class PremiumPolicy implements Policy {

    @NotBlank(message = "Policy name should not be blank")
    private String policyName;

    public PremiumPolicy() {
        this.policyName = "Premium Policy";
    }

    @Override
    public void applyPolicy() {
        System.out.println("Applying "+policyName);
    }

}
