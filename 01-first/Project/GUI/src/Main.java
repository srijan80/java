import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private int clickCount = 0;
    private JLabel label;

    public static void gui() {
        Main main = new Main();

        JFrame frame = new JFrame();
        JButton button = new JButton("Click Me");
        button.addActionListener(main);

        main.label = new JLabel("COUNT: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 20));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(main.label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click Me")) {
            clickCount++;
            label.setText("Fuck: " + clickCount);
        }
    }
}
