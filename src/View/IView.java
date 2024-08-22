package View;
import java.awt.event.ActionListener;
/**
 * This is the View interface!
 */
public interface IView {
    /**
     * Make the view visible. This is usually called
     * after the view is constructed.
     */
    void makeVisible(ActionListener actionListener);
}
