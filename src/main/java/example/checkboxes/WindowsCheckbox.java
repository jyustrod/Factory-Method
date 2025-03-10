package example.checkboxes;

import javax.swing.*;
import java.awt.*;

public class WindowsCheckbox implements Checkbox {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JCheckBox checkbox;

    @Override
    public void paint() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Seleccione la opción:");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        checkbox = new JCheckBox("Opción");
        panel.add(checkbox);

        frame.setSize(320, 200);
        frame.setVisible(true);
    }
}