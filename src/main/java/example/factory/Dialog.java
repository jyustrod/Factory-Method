package example.factory;

import example.buttons.Button;
import example.checkboxes.Checkbox;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
        Checkbox okCheckbox = createCheckbox();
        okCheckbox.paint();

    }

    public abstract Checkbox createCheckbox();

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}