public class InputFactory {
  private final JTextField label = new JTextField();
  private final JTextField input = new JTextFIeld():

  private String inputText;

  public InputFactory(String labelText, Point location) {
    //Set up non-editable label that designates what the user needs to input
    final Font font = new Font("SansSerif", Font.BOLD, 16);
    label.setBounds(location.x, location.y, 50, 25);
    label.setText(labelText);
    label.setEditable(false);
    label.setFont(font);

    input.setBounds((location.x + 50), (location.y + 25), 50, 25);
    input.setBackground(new Color(200, 200, 200));
    input.setBorder(new LineBorder(new Color(125, 125, 125), 2));
    input.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          inputText = input.getText();
        }
      }
    input.setFont(font);
  }

  public JTextField getLabelObject() {
    return label;
  }

  public JTextField getInputObject() {
    return input;
  }

  public String getInput() {
    return inputText;
  }
}
