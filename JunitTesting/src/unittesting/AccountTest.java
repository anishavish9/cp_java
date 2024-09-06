package unittesting;

import org.junit.Test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Assert;

public class AccountTest {
    private Account acc;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class annotation called: Setting up the class level resources");
    }
    
    @Before
    public void setUp() {
        acc = new Account(5000.0);
        System.out.println("@Before annotation called for setting up the account for each test");
    }

    @Test
    public void testDeposit() {
        acc.deposit(1000.0);
        Assert.assertEquals(6000.0, acc.getBalanceAmount(), 0.0);
    }

    @Test
    public void testWithDraw() {
        acc.withDraw(2000.0);
        Assert.assertEquals(3000.0, acc.getBalanceAmount(), 0.0);
    }
    
    @After
    public void tearDown() {
    	System.out.println("clean up process after each test");
    }
    
    @After
    public void tearDownClass() {
    	System.out.println("Releasing the class resources");
    }
     
}

