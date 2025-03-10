package example.factory;

import example.buttons.Button;
import example.buttons.FlutterButton;
import example.checkboxes.Checkbox;

public class FlutterDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return null;
    }

    @Override
    public Button createButton() {
        return new FlutterButton();
    }
}
