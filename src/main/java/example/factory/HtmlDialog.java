package example.factory;


import example.buttons.Button;
import example.buttons.HtmlButton;
import example.checkboxes.Checkbox;
import example.checkboxes.HtmlCheckbox;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Checkbox createCheckbox() {
        return new HtmlCheckbox();
    }

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}