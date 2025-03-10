package example.factory;

import example.buttons.AppleButton;
import example.buttons.Button;
import example.checkboxes.Checkbox;

public class AppleDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return null;
    }

    @Override
    public Button createButton() {
        return new AppleButton();
    }
}
