package lost;

import com.excel.ReadCSVData;
import com.excel.ReadDatabaseUtils;
import com.excel.ReadExcelTest;
import org.testng.annotations.DataProvider;

import java.io.File;

public class DataTest {

    @DataProvider
    public Object[][] dataTest(){
        Object[][] objs = new Object[][]{
                {10,10,30},
                {10,20,30}
        };
        return objs;
    }
    @DataProvider
    public static Object[][] excelDataTast(){
        File f =new File("dataTestCSV.csv");
        String fileName=f.getName();
        String prefix=fileName.substring(fileName.lastIndexOf(".")+1);
        if (prefix.equals("xlsx")){
            return ReadExcelTest.getExcelData(fileName);
        }else if (prefix.equals("csv")) {
            return ReadCSVData.getCSVData(fileName);
        }else
            return null;
    }

}