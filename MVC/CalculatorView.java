import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private final JTextField firstNumber = new JTextField(10);
    private final JTextField secondNumber = new JTextField(10);
    private final JButton calculateButton = new JButton("Calculate");
    private final JTextField result = new JTextField(10);
    private final JComboBox<String> operation = new JComboBox<>(new String[] { "Add", "Subtract" });

    public CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(new JLabel("Number 1:"));
        calcPanel.add(firstNumber);
        calcPanel.add(new JLabel("Number 2:"));
        calcPanel.add(secondNumber);
        calcPanel.add(new JLabel("Operation:"));
        calcPanel.add(operation);
        calcPanel.add(calculateButton);
        calcPanel.add(new JLabel("Result:"));
        calcPanel.add(result);

        this.add(calcPanel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public String getOperation() {
        return operation.getSelectedItem().toString();
    }

    public void setResult(double result) {
        this.result.setText(Double.toString(result));
    }

    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
