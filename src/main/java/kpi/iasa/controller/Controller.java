package kpi.iasa.controller;

import kpi.iasa.model.Model;
import kpi.iasa.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model,View view)
    {
        this.model=model;
        this.view=view;
    }


    public void processUser()
    {
        Scanner sc=new Scanner(System.in);
        ConsoleInputController consoleInputController=
                new ConsoleInputController(view,sc);
        consoleInputController.makeInput();

    }



}
