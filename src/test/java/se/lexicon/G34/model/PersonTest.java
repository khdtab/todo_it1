package se.lexicon.G34.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person testObject;

    // setup method
    @Before
    public void setup(){
        testObject = new Person();
        testObject.setPersonId(1);
        testObject.setFirstName("Test");
        testObject.setLastName("Testsson");
    }

    // test cases
    @Test
    public void test_getPersonId(){
        int expectedResult = 1;
        int actualResult = testObject.getPersonId(); // 1
        Assert.assertEquals(expectedResult,actualResult);
    }
}
