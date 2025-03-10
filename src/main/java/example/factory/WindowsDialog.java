package example.factory;

import example.buttons.Button;
import example.buttons.WindowsButton;
import example.checkboxes.Checkbox;
import example.checkboxes.WindowsCheckbox;

public class WindowsDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}