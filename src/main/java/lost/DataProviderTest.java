package lost;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProviderClass = DataTest.class,dataProvider = "excelDataTast")
    public void excelOperation(int x,int y,int z){
        int math = x+y;
        Assert.assertEquals(math,z);
    }
    @Test(dataProviderClass = DataTest.class,dataProvider = "dataTest")
    public void dataOperation(int x,int y,int z){
        int math = x+y;
        Assert.assertEquals(math,z);
    }
    @Test
    public void data1(){
        Assert.assertEquals(10,21);
    }

}
