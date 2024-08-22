package Model;

/**
 * This interface will represent the choice a user can make/input.
 */
public interface IChoice {
  /**
   * This allows the user to modify a choice!
   * @param newChoice - new choice to change to.
   */
   public void modifyChoice(String newChoice);
}
