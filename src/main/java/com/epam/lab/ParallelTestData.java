package com.epam.lab;

import com.epam.lab.xmlModel.LoginDataProp;
import com.epam.lab.xmlModel.XmlToObject;
import org.testng.annotations.DataProvider;

import java.util.List;

public class ParallelTestData {
    @DataProvider(name = "testData", parallel = true)
    public Object[][] testData() {
        List<LoginDataProp> list = XmlToObject.getData();
        Object[][] data = new Object[list.size()][1];
        int count = 0;
        while (count < list.size()) {
            data[count] = new Object[]{list.get(count).getLoginData(), list.get(count).getPasswordData()};
            count++;
        }
        return data;
    }
}
