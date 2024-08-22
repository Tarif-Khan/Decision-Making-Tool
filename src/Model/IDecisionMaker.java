package Model;

/**
 * This is the interface of the model which will make the choices!
 */
public interface IDecisionMaker {
  /**
   * This method will allow you to add a choice.
   * @param choice - choice to add.
   */
  public void addChoice(Choice choice);

  /**
   * This method will allow you to delete a choice.
   * @param choice - choice to delete.
   */
  public void deleteChoice(Choice choice);

  /**
   * This method will allow the computer to select a choice at random.
   * @return - returns the choice selected!
   */
  public Choice selectChoice() throws Exception;

  /**
   * This method allows you to modify a choice.
   * @param choice - choice to modify.
   * @param newMessage - the new message!
   */
  public void modifyChoiceInList(Choice choice, String newMessage);

  /**
   * This will check the size of the list of choices
   */
  public int choiceListSize();

  /**
   * Gets the choice at an index.
   * @param index - index in list.
   */
  public Choice getChoice(int index);

  /**
   * Gets the message of a choice.
   * @param index - index in list.
   */
  public String getMessage(int index);
}
