import javax.swing.*;
import java.awt.*;

public class MToggleButton extends JToggleButton {
    enum Mode {
        SIDE,
        ANGLE;
    }

    Mode mode;

    public MToggleButton(Mode mode, String text, Rectangle bounds) {
        this.mode = mode;
        super.setText(text);
        super.setBounds(bounds);
    }

    public Mode getMode() {
        return mode;
    }

    public void switchMode() {
        if (this.getMode() == Mode.SIDE) {
            mode = Mode.ANGLE;
            this.setSelected(true);
            this.setText("Angle");
        } else {
            mode = Mode.SIDE;
            this.setSelected(false);
            this.setText("Side");
        }
    }
}
