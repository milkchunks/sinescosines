import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static final JTextField display = new JTextField("hi");
    static final MToggleButton toggle = new MToggleButton(MToggleButton.Mode.SIDE, "Side", createBounds(250, 110));

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sines");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 400, 500);
        frame.setLayout(null);
        frame.setResizable(false);

        JButton sines = new JButton("Sines (Side)");
        sines.setBounds(createBounds(0, 110));
        sines.addActionListener(sinesAL);

        JButton cosines = new JButton("Cosines");
        cosines.setBounds(createBounds(110, 110));
        cosines.addActionListener(cosinesAL);

        toggle.setBounds(createBounds(250, 0));
        toggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggle.switchMode();
            }
        });

        display.setBounds(0, 0, 400, 100);
        display.setFont(new Font("SansSerif", Font.BOLD, 16));

        frame.add(sines);
        frame.add(cosines);
        frame.add(toggle);
        frame.add(display);

        frame.setVisible(true);
    }

    private static Rectangle createBounds(int x, int y) {
        return new Rectangle(x, y, 100, 50);
    }

    static final ActionListener sinesAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (toggle.getMode() == MToggleButton.Mode.SIDE) {
                display.setText("sines(b, m<A, m<B)");
            } else {
                display.setText("sines(a, b, m<B");
            }
        }
    };

    //sinA/a = sinB/b
    //a = b * (sinA/sinB)
    //m<A = arcsin((a * sinB)/b)
    static final ActionListener cosinesAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (toggle.getMode() == MToggleButton.Mode.SIDE) {
                display.setText("cosines(a, b, m<C");
            } else {

            }
        }
    };
    //c^2 = a^2 + b^2 - (2*a*b*cosC)
    //m<C = arccos((b^2  + c^2 - a^2) / (2 * a * c))
}

