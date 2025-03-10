package example.factory;

import example.buttons.AppleButton;
import example.buttons.Button;

public class AppleDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AppleButton();
    }
}
