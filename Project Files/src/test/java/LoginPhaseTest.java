import Controll.Bejelentkezes.LoginPhase;
import Modell.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginPhaseTest {

    private LoginPhase loginPhase;
    private Map<String,User> testAccounts;

    @Before
    public void setUp(){
        loginPhase = new LoginPhase();
        testAccounts = new HashMap<>();
        testAccounts.put("Test",new User());
    }

    @After
    public void tearDown(){
        loginPhase = null;
        testAccounts = null;
    }

    @Test
    public void testValidatePassword(){
        String testAccName = "tester02";
        String test01 = "Ac241acx";
        String test02 = "AcvpasvmnopasnvopSPÚFSCPÚASmcpúrüó1iüö42194u128if";
        String test03 = "$asfcacsa";
        String test04 = "asfasfa$fsafasfa";
        String test05="1234567891011120";

        Assert.assertEquals(true,loginPhase.validatePassword(test01,testAccName,testAccounts));
        Assert.assertEquals(false,loginPhase.validatePassword(test02,testAccName,testAccounts));
        Assert.assertEquals(false,loginPhase.validatePassword(test03,testAccName,testAccounts));
        Assert.assertEquals(false,loginPhase.validatePassword(test04,testAccName,testAccounts));
        Assert.assertEquals(true,loginPhase.validatePassword(test05,testAccName,testAccounts));
        Assert.assertEquals(false,loginPhase.validatePassword(test01,"tester01",testAccounts));
    }

    @Test
    public void TestCoders(){
        String testPasswd = "Hello123";

        Assert.assertEquals("npnpnipibnvajoofaHello123phuboanovnipkanvp",loginPhase.hasher(testPasswd));

    }
}
