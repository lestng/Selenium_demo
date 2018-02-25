package lost;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG1 {
    @Test
    public void Test_demo(){
        Assert.assertEquals(1,1);
        System.out.println("test");
    }
    @AfterClass
    public void dom_jk(){
        System.out.println("类名");
    }
    @BeforeClass
    public void bfa(){
        System.out.println("class");
    }
}
