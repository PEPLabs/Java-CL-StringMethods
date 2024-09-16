
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleStringMethodsTest {

    static SimpleStringMethods ssm;

    @BeforeClass
    public static void setUp(){
        ssm = new SimpleStringMethods();
    }

    /**
     * Tests the getStringLength() method of the SimpleStringMethods class.
     * 
     * This test verifies that, if getStringLength() receives a value of "aaa", it returns 3.
     */
    @Test
    public void lengthTest(){
        Assert.assertEquals(3, ssm.getStringLength("aaa"));
    }
    
    /**
     * Tests the getCharacterAtIndex() method of the SimpleStringMethods class.
     * 
     * This test verifies that, if getCharacterAtIndex() receives the values "abcdef" and 2, it returns 'c'.
     */
    @Test
    public void charAtTest1(){
        Assert.assertEquals('c',ssm.getCharacterAtIndex("abcdef", 2));
    }
    
    /**
     * Tests the getCharacterAtIndex() method of the SimpleStringMethods class.
     * 
     * This test verifies that, if getCharacterAtIndex() receives the values "abcdef" and 0, it returns 'a'.
     */
    @Test
    public void charAtTest2(){
        Assert.assertEquals('a', ssm.getCharacterAtIndex("abcdef", 0));
    }

    /**
     * Tests the getIndexGivenCharacter() method of the SimpleStringMethods class.
     * 
     * This test verifies that, if getIndexGivenCharacter() receives the values "zebra" and 'b', it returns 2.
     */
    @Test
    public void indexOfTest1(){
        Assert.assertEquals(2, ssm.getIndexGivenCharacter("zebra", 'b'));
    }
    
    /**
     * Tests the getIndexGivenCharacter() method of the SimpleStringMethods class.
     * 
     * This test verifies that, if getIndexGivenCharacter() receives the values "banana" and 'q', it returns -1.
     */
    @Test
    public void indexOfTest2(){
        Assert.assertEquals(-1, ssm.getIndexGivenCharacter("banana", 'q'));
    }

}
