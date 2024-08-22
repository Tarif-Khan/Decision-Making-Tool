package Controller;

/**
 * This class represents the controller of the decision making application.
 *
 */
public interface IController {
  /**
   * Runs the image processing program.
   *
   * @throws IllegalStateException if the controller is unable to successfully read input
   *                               or transmit output
   */
  void runProgram() throws IllegalStateException;
}
