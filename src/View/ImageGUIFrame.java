package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * The class for the view of our frame for our program.
 */
public class ImageGUIFrame extends JFrame implements IView {

  private JLabel imageLabel;
  public JPanel mainPanel;


  /**
   * The frame for our GUI is constructed here with a controller.
   */
  public ImageGUIFrame() {
    super();
  }

  /**
   * The method initFrame initializes the frame of our gui with all the components.
   *
   * @param actionListener the action listener delegates the command of what happens.
   */
  public void initFrame(ActionListener actionListener) {
    this.setTitle("Decision Maker");
    this.setSize(800, 800);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainPanel = new JPanel();

    //this is the main panel
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    JScrollPane mainScrollPane = new JScrollPane(mainPanel);
    add(mainScrollPane);

    //dialog boxes
    JPanel dialogBoxesPanel = new JPanel();
    dialogBoxesPanel.setBorder(BorderFactory.createTitledBorder("Decision Maker"));
    mainPanel.add(dialogBoxesPanel);
    dialogBoxesPanel.setLayout(new BoxLayout(dialogBoxesPanel, BoxLayout.PAGE_AXIS));

    JPanel addChoicePanel = new JPanel();
    addChoicePanel.setLayout(new FlowLayout());
    dialogBoxesPanel.add(addChoicePanel);
    JButton addChoice = new JButton("Add a new option!");
    addChoice.setActionCommand("Add");
    addChoice.addActionListener(actionListener);
    addChoicePanel.add(addChoice);


    JPanel deleteChoicePanel = new JPanel();
    deleteChoicePanel.setLayout(new FlowLayout());
    dialogBoxesPanel.add(deleteChoicePanel);
    JButton deleteChoice = new JButton("Delete an option.");
    deleteChoice.setActionCommand("Delete");
    deleteChoice.addActionListener(actionListener);
    deleteChoicePanel.add(deleteChoice);

    JPanel modifyChoicePanel = new JPanel();
    modifyChoicePanel.setLayout(new FlowLayout());
    dialogBoxesPanel.add(modifyChoicePanel);
    JButton modifyChoice = new JButton("Modify an option.");
    modifyChoice.setActionCommand("Modify");
    modifyChoice.addActionListener(actionListener);
    modifyChoicePanel.add(modifyChoice);

    JPanel selectChoicePanel = new JPanel();
    selectChoicePanel.setLayout(new FlowLayout());
    dialogBoxesPanel.add(selectChoicePanel);
    JButton selectChoice = new JButton("Have the program make the decision for you!");
    selectChoice.setActionCommand("Select");
    selectChoice.addActionListener(actionListener);
    selectChoicePanel.add(selectChoice);


    this.validate();
  }

  /**
   * The make visible method allows the view to come to fruition.
   *
   * @param actionListener the actionlistener is passed into the view to get behavior.
   */
  @Override
  public void makeVisible(ActionListener actionListener) {
    this.setDefaultLookAndFeelDecorated(false);
    this.initFrame(actionListener);
    this.setVisible(true);
  }
}
