package lab4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BankAccountSystemTestCase {

    @Test
    public void testDeposit1() {
        BankAccount account = new BankAccount("hhh",123, 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
    @Test
    public void testDeposit2() {
        BankAccount account = new BankAccount(null,123, 1000);
        assertNull(account.deposit(100));
      
    } @Test
    public void testDeposit3() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        account.deposit(-500);
        assertEquals(500, account.getBalance());
    }
    @Test
    public void testDeposit4() {
        BankAccount account = new BankAccount("ahmed",123, -100);
        account.deposit(500);
     assertEquals(400, account.getBalance());
    }
    @Test
    public void testDeposit5() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        assertNotNull(account);
    }
    
    @Test
    public void testDeposit6() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }
    @Test
    public void testWithdraw3() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        assertTrue(account.withdraw(500));
        assertEquals(500, account.getBalance());
    }
    @Test
    public void testWithdraw4() {
        BankAccount account = new BankAccount("ahmed",1234, 1000);
        assertTrue(account.withdraw(500));
        assertEquals(500, account.getBalance());
    }
    @Test
    public void testWithdraw1() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        assertTrue(account.withdraw(500));
    }
    @Test
    public void testWithdraw2() {
        BankAccount account = new BankAccount("ahmed",123, 1000);
        assertFalse(account.withdraw(1500));
    }
    
}

