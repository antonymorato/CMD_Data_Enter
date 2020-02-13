package kpi.iasa.controller;

import kpi.iasa.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class ConsoleInputController {

    private Map<String , String> personInfo;
    private Scanner sc;
    private View view;
    public ConsoleInputController(View view,Scanner sc)
    {   this.view=view;
        this.sc=sc;
        personInfo=new HashMap<String, String>();
    }

    public void makeInput() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        personInfo.put("firstname",
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str));
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }



}
