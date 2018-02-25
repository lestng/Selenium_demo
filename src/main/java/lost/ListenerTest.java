package lost;


import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class ListenerTest extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        String name = iTestResult.getMethod().getMethodName();
        Reporter.log("方法"+name+"运行失败");
        System.out.println("----->"+name);
    }
}
