package email.controller;

import email.EmailManager;
import email.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;

public class OptionsWindowController extends BaseController {

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private Slider fontSizePicker;

    @FXML
    private ChoiceBox<?> themePicker;

    @FXML
    void applyBtnAction() {

    }

    @FXML
    void cancelButtonAction() {

    }
}
