import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Model.Choice;
import Model.DecisionMaker;
import static org.junit.Assert.*;

public class DecisionMakerTest {

  @Test
  public void testConstructor(){
    Choice choice1 = new Choice("choice 1");
    Choice choice2 = new Choice("choice 2");
    Choice choice3 = new Choice("choice 3");
    List<Choice> choices = Arrays.asList(choice1, choice2, choice3);
    DecisionMaker D1 = new DecisionMaker(choices);
  }

  @Test
  public void testAddChoice(){
    Choice choice1 = new Choice("choice 1");
    Choice choice2 = new Choice("choice 2");
    Choice choice3 = new Choice("choice 3");
    List<Choice> choices = new ArrayList<Choice>();
    choices.add(choice1);
    choices.add(choice2);
    choices.add(choice3);
    DecisionMaker D1 = new DecisionMaker(choices);
    assertEquals(D1.choiceListSize(), 3);

    Choice choice4 = new Choice("choice 4");
    D1.addChoice(choice4);
    assertEquals(D1.choiceListSize(),4);

    Choice choice5 = new Choice("Choice 5");
    D1.addChoice(choice5);
    assertEquals(D1.choiceListSize(), 5);

    D1.addChoice(new Choice("Choice 6"));
    assertEquals(D1.choiceListSize(), 6);
  }

  @Test
  public void testDeleteChoice(){
    Choice choice1 = new Choice("choice 1");
    Choice choice2 = new Choice("choice 2");
    Choice choice3 = new Choice("choice 3");
    List<Choice> choices = new ArrayList<Choice>();
    choices.add(choice1);
    choices.add(choice2);
    choices.add(choice3);
    DecisionMaker D1 = new DecisionMaker(choices);
    assertEquals(D1.choiceListSize(), 3);

    D1.deleteChoice(choice1);
    assertEquals(D1.choiceListSize(), 2);

    D1.deleteChoice(choice2);
    assertEquals(D1.choiceListSize(), 1);

    D1.deleteChoice(choice3);
    assertEquals(D1.choiceListSize(), 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeleteExceptionEmptyList(){
    Choice choice1 = new Choice("choice 1");
    List<Choice> choices = new ArrayList<Choice>();
    DecisionMaker D1 = new DecisionMaker(choices);
    assertEquals(D1.choiceListSize(), 0);
    D1.deleteChoice(choice1);
  }

  @Test
  public void testModifyChoiceInList(){
    Choice choice1 = new Choice("choice 1");
    Choice choice2 = new Choice("choice 2");
    List<Choice> choices = new ArrayList<Choice>();
    choices.add(choice1);
    choices.add(choice2);
    DecisionMaker D1 = new DecisionMaker(choices);

    assertEquals(D1.getMessage(0), "choice 1");
    D1.modifyChoiceInList(choice1, "Tarif is the best!");
    assertEquals(D1.getMessage(0), "Tarif is the best!");

    assertEquals(D1.getMessage(1), "choice 2");
    D1.modifyChoiceInList(choice2, "Sonia is great!");
    assertEquals(D1.getMessage(1), "Sonia is great!");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testModifyFail(){
    List<Choice> choices = new ArrayList<Choice>();
    DecisionMaker D1 = new DecisionMaker(choices);
    Choice choice1 = new Choice("choice 1");
    D1.modifyChoiceInList(choice1, "Tarif is the best!");
  }
}
