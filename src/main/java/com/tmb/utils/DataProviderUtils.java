package com.tmb.utils;

import com.tmb.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

public class DataProviderUtils {

    @DataSupplier(runInParallel = true) //Object[][] or Object[] //json,csv,yaml, excel
    public StreamEx<TestData> getData(Method method){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()//3
                .filter(testdata -> testdata.testCaseName.equalsIgnoreCase(method.getName()));//2
    }
}
