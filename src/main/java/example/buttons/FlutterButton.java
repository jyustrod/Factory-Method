package example.buttons;

public class FlutterButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a button in Flutter style");
    }

    @Override
    public void onClick() {
        System.out.println("Click on a button in Flutter style");
    }
}
