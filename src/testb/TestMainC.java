package testb;

import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;
import test.TestA;

public class TestMainC {


    @Test
    public void testFindMax(){

        TestA testA = new TestA();

        int value = testA.addNumber(3,4);

        Assert.assertEquals(7,value);
        


    }
}
