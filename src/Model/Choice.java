package Model;

/**\
 * This class represents a choice that a user can have the program decide.
 */
public class Choice implements IChoice{
  public String choice;


  public Choice(String choice){
    if(choice.equals("")  || choice.length() <= 0){
      throw new IllegalArgumentException("Invalid choice Description! Please enter a choice of 2 or"
              + " more characters");
    }
    this.choice = choice;
  }

  @Override
  public void modifyChoice(String newChoice) {
    this.choice = newChoice;
  }
}
