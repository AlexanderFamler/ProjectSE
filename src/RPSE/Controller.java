package RPSE;

import javafx.event.ActionEvent;


public class Controller {
    public void pressButton (ActionEvent event) {
        System.out.println("Button works");
        event.consume();
    }
}
