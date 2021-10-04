import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;

    @Before
    public void before() {
        onlineAccount = new OnlineAccount("Jeremy");
    }

    @Test
    public void hasName() {
        assertEquals("Jeremy", onlineAccount.getCustomerName());
    }
}
