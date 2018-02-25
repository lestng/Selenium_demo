package lost;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
    @Parameters(value = {"name","password"})
    @Test
    public void Login(String name,String password){
        System.out.println("name:"+name+" password:"+password);
    }
}
