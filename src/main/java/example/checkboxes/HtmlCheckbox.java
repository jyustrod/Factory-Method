package example.checkboxes;

public class HtmlCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("<input type='checkbox' /> Opción");
    }
}