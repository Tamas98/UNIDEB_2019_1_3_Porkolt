import Controll.Kikerdez.TestPhase;
import javafx.scene.text.Text;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPhaseTest {

    private TestPhase testPhase;
    private Text textField;

    @Before
    public void setUp(){
        testPhase = new TestPhase();
        textField = new Text();
        textField.setText("Test");
    }

    @After
    public void tearDown(){
        testPhase = null;
        textField = null;
    }

    @Test
    public void TestFunctions(){

        Assert.assertNotNull(testPhase.getLearned()); //Működik e a lekérdezés

        testPhase.checkAnswer("alma","apple",textField);
        Assert.assertEquals("Helyes válasz",textField.getText()); // Felismeri-e hogy helyes a válasz és megváltoztatja a szöveget.

        testPhase.checkAnswer("alma","aPPlee",textField);
        Assert.assertEquals("Helytelen válasz, helyes válasz: alma - apple",textField.getText()); //Felismeri ha helytelen a válasz?

        testPhase.checkAnswer("almaaa","apple",textField);
        Assert.assertEquals("Helytelen válasz, helyes válasz: alma - apple",textField.getText()); // Ha a magyar a rossz is felismeri-e

        testPhase.checkAnswer("ALMA","APPLE",textField);
        Assert.assertEquals("Helyes válasz",textField.getText()); // Felismeri-e ha nagybetűvel írunk mindent
    }
}
