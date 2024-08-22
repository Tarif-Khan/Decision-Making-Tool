package Model;
import java.util.List;
import java.util.Random;

/**
 * This is the main DecisionMaker.
 */
public class DecisionMaker implements IDecisionMaker{
   List<Choice> choices;

  public DecisionMaker(List<Choice> choices){
    this.choices = choices;
  }

  @Override
  public void addChoice(Choice choice) {
    this.choices.add(choice);
  }

  @Override
  public void deleteChoice(Choice choice) throws IllegalArgumentException {
    if (!this.choices.contains(choice)) {
      throw new IllegalArgumentException("This choice does not exist in the list!");
    }
    this.choices.remove(choice);
  }

  @Override
  public Choice selectChoice() throws Exception {
    if (this.choices.isEmpty()) {
      throw new Exception("No options to choose from!");
    }
    Random rand = new Random();
    Choice decision = choices.get(rand.nextInt(choices.size()));
    return decision;
  }

  @Override
  public void modifyChoiceInList(Choice choice, String newMessage) {
    if (!this.choices.contains(choice)) {
      throw new IllegalArgumentException("This choice does not exist in the list!");
    }
    for(int i = 0; i < choices.size(); i++){
      if(choice.choice.equals(choices.get(i).choice)){
        choices.get(i).modifyChoice(newMessage);
      }
    }
  }

  @Override
  public int choiceListSize(){
    return this.choices.size();
  }

  @Override
  public Choice getChoice(int index) {
    return this.choices.get(index);
  }

  public Choice getChoiceByMessage(String message) throws IllegalArgumentException {
    for(int i = 0; i < choices.size(); i++){
      if(choices.get(i).choice.equals(message)) {
        return choices.get(i);
      }
    }
   throw new IllegalArgumentException("Not found");
  }

  @Override
  public String getMessage(int index) {
    return this.choices.get(index).choice;
  }
}
