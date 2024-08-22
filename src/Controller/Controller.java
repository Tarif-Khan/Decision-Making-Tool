package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Model.Choice;
import Model.DecisionMaker;
import View.ImageGUIFrame;


/**
 * This is the Controller for the GUI.
 */
public class Controller implements IController, ActionListener {
  private DecisionMaker model;
  private ImageGUIFrame view;



  /**
   * Constructs a gui controller which connects to the model and the view.
   *
   * @param model the image processing model
   * @param view  the image processing view
   * @throws IllegalArgumentException if the model or view is null
   */
  public Controller(DecisionMaker model, ImageGUIFrame view)
          throws IllegalArgumentException {
    if (model == null || view == null) {
      throw new IllegalArgumentException("Invalid model, view or input");
    }
    this.model = model;
    this.view = view;
  }


  @Override
  public void runProgram() throws IllegalStateException {
    this.view.makeVisible(this);
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case "Add":
        try {
          JDialog f = new JDialog();
          f.setModal(true); // Makes the dialog not modal
          String name=JOptionPane.showInputDialog(f,"Enter A Choice to ADD!");
          this.model.addChoice(new Choice(name));
        }
        catch (Exception ex) {
          throw new IllegalArgumentException();
        }
      break;
      case "Delete":
        try {
          JDialog f = new JDialog();
          f.setModal(true); // Makes the dialog not modal
          String name=JOptionPane.showInputDialog(f,"Enter A Choice to DELETE!");
          this.model.deleteChoice(this.model.getChoiceByMessage(name));
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
      break;
      case "Modify":
        try {
          JDialog f = new JDialog();
          f.setModal(true); // Makes the dialog not modal
          String name=JOptionPane.showInputDialog(f,"Enter A Choice to Modify!");
          String newMessage = JOptionPane.showInputDialog(f, "Enter new message!");
          this.model.modifyChoiceInList(this.model.getChoiceByMessage(name), newMessage);
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
      break;
      case "Select":
        try {
          JDialog f = new JDialog();
          f.setModal(true); // Makes the dialog not modal
          JOptionPane.showMessageDialog(f, this.model.selectChoice().choice);
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
        break;
      default:
    }
  }
}