package example.factory;

import example.buttons.Button;
import example.buttons.FlutterButton;

public class FlutterDialog extends Dialog {

    @Override
    public Button createButton() {
        return new FlutterButton();
    }
}
