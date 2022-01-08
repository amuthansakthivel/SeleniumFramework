package com.tmb.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String REPORT_PATH = System.getProperty("user.dir")+"/index.html";

    public static String getReportPath(){
        return REPORT_PATH;
    }
}
