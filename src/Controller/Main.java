package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Choice;
import Model.DecisionMaker;
import View.ImageGUIFrame;

public class Main {
  public static void main(String[] args) {
     List<Choice> choices = new ArrayList();
     DecisionMaker decisionMaker = new DecisionMaker(choices);
     ImageGUIFrame view = new ImageGUIFrame();
     Controller controller2 = new Controller(decisionMaker, view);
     controller2.runProgram();
  }
}
