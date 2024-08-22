import org.junit.*;
import Model.Choice;
import static org.junit.Assert.*;
public class ChoiceTest {

  @Test
  public void testConstructor(){
   Choice choice1 = new Choice("choice 1");
   Choice choice2 = new Choice("choice 2");
   Choice choice3 = new Choice("choice 3");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExceptions(){
  Choice fail1 = new Choice("");
  Choice fail2 = new Choice("1");
  }

  @Test
  public void testModifyChoice(){
    Choice choice1 = new Choice("Cotton Candy");
    assertEquals(choice1.choice, "Cotton Candy");
    choice1.modifyChoice("Chocolate");
    assertEquals(choice1.choice, "Chocolate");

    Choice choice2 = new Choice("Hawaii");
    assertEquals(choice2.choice, "Hawaii");
    choice2.modifyChoice("New York");
    assertEquals(choice2.choice, "New York");

    Choice choice3 = new Choice("Apples");
    assertEquals(choice3.choice, "Apples");
    choice3.modifyChoice("Oranges");
    assertEquals(choice3.choice, "Oranges");
  }
}
