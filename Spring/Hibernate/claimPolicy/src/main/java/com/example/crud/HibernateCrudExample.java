package com.example.crud;

import java.util.List;
import com.example.dao.ClaimDao;
import com.example.dao.PolicyDao;
import com.example.entity.Claim;
import com.example.entity.Policy;
import com.example.util.HibernateUtil;

public class HibernateCrudExample {

    public static void main(String[] args) {
    	try {

            ClaimDao claimDao = new ClaimDao();
            PolicyDao policyDao = new PolicyDao();

            // Create Claims and Policies
            claimDao.saveClaim(new Claim("CL12345", 1500.00, "Approved"));
            claimDao.saveClaim(new Claim("CL67890", 2500.00, "Pending"));

            policyDao.savePolicy(new Policy("POL12345", "John Doe", 50000.00));
            policyDao.savePolicy(new Policy("POL67890", "Jane Doe", 60000.00));

            // Read Claims and Policies
            List<Claim> claims = claimDao.getClaims();
            List<Policy> policies = policyDao.getPolicies();
            
            System.out.println("Claims:");
            for (Claim claim : claims) {
                System.out.println(claim);
            }
            
            System.out.println("Policies:");
            for (Policy policy : policies) {
                System.out.println(policy);
            }

//            // Update and Delete examples
//            if (!claims.isEmpty()) {
//                Claim claim = claims.get(0);
//                claim.setAmount(2000.00);
//                claimDao.updateClaim(claim);
//
//                claimDao.deleteClaim(claim.getId());
//            }
//
//            if (!policies.isEmpty()) {
//                Policy policy = policies.get(0);
//                policy.setCoverageAmount(55000.00);
//                policyDao.updatePolicy(policy);
//
//                policyDao.deletePolicy(policy.getId());
//            }
//
//            // Read again to verify updates
//            claims = claimDao.getClaims();
//            policies = policyDao.getPolicies();
//            
//            System.out.println("Updated Claims:");
//            for (Claim claim : claims) {
//                System.out.println(claim);
//            }
//            
//            System.out.println("Updated Policies:");
//            for (Policy policy : policies) {
//                System.out.println(policy);
//            }

            // Shutdown Hibernate
            //HibernateUtil.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
