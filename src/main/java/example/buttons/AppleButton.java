package example.buttons;

public class AppleButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a button in Apple style");
    }

    @Override
    public void onClick() {
        System.out.println("Click on a button in Apple style");
    }
}
